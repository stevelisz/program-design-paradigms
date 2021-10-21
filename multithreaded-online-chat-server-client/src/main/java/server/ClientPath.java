package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Map;
/**
 * This class represents clientPath object that connected to the server to handle communication between server and client.
 */
public class ClientPath implements Runnable {

  public static final int QUERY_USER_RESPONSE = 23;
  public static final int CONNECT_RESPONSE = 20;
  private DataInputStream dis;
  private DataOutputStream dos;
  private Socket client;
  private boolean flag;
  private String username;

  /**
   * constructor.
   * @param client socket client.
   */
  public ClientPath(Socket client) {
    flag = true;
    this.client = client;
    try {
      dis = new DataInputStream(client.getInputStream()); //connecting
      dos = new DataOutputStream(client.getOutputStream()); //connecting
      String username = receive(); //receive username input as format of "19 size usernameByte"
      if (Server.clientPathHashMap.containsKey(username)) { //check if its duplicated.
        this.send("DUPLICATE USERNAME. RESTART CLIENT AND TRY AGAIN");
        // here should send fail message and ask client to try a different username
      } else {
        this.username = username.split(" ")[2];  //extract username
        byte[] bytes = this.username.getBytes();
        Server.clientPathHashMap.put(new String(bytes), this); //store in hashmap with username as key and clientpath as value.
        this.sendConnectResponse();
      }
    } catch (Exception e) {
      this.release();
    }
  }

  /**
   * receive message(in format of request) from client and process it with ServerProtocol. Directly
   * handle requests which don't need response.
   * @return processed msg(in format of response) if response is required.
   */
  public String receive() {
    String msg = "";
    try {
      msg = ServerProtocol.processClientMessage(dis.readUTF());
    } catch (IOException e) {
      release();
    }
    return msg;
  }

  /**
   * write to data output stream to send msg to certain client.
   * @param msg msg.
   */
  public void send(String msg) {
    try {
      dos.writeUTF((msg));
      dos.flush();
    } catch (IOException e) {
      release();
    }
  }

  /**
   * send to others or self depending on if message is a response.
   * @param msg message.
   */
  public void sendOthers(String msg) {

    boolean isResponse = (msg.startsWith(Integer.toString(QUERY_USER_RESPONSE)) || msg
        .startsWith(Integer.toString(CONNECT_RESPONSE)));
    for (Map.Entry<String, ClientPath> entry : Server.clientPathHashMap.entrySet()) {

      if (entry.getValue().equals(this)) {
        continue; //continue if it's this clientPath
      }
      if (isResponse) { //if it's a response, it needs to be received by client
        this.send(msg); //only the client will receive this message and to be processed.
      } else {
        entry.getValue().send(this.username + " says to everyone: " + msg);//otherwise it's supposed to be received by everyone.
      }
    }
  }

  /**
   * send message to all clientPath.
   * @param message message
   */
  public void sendAll(String message) {
    for (String username : Server.clientPathHashMap.keySet()) {
      ClientPath member = Server.clientPathHashMap.get(username);
      member.send(message);
    }
  }

  /**
   * release, close all data streams.
   */
  public void release() {
    this.flag = false;
    CloseUtil.closeAll(dis, dos, client);
    if (Server.clientPathHashMap.containsKey(this.username)) {
      Server.clientPathHashMap.remove(this.username);
      sendOthers(this.username + " just logged off.");
    }
  }

  @Override
  public void run() {
    while (flag) {
      String msg = receive();
      if (!msg.equals("")) {
        sendOthers(msg);
      }
    }
  }

  /**
   * get the username of the clientPath.
   * @return username.
   */
  public String getUsername() {
    return username;
  }

  // first send a string as connect response
  // then implement byte array if necessary
  // useless, but can change and put into protocol
  public void sendConnectResponse() {
    int identifier = ServerProtocol.CONNECT_RESPONSE;
    boolean success = this.flag;
    String message =
        "there are " + Server.clientPathHashMap.keySet().size() + " connected user(s).";
    int sizeOfMessage = message.length();
    this.send(identifier + " " + success + " " + sizeOfMessage + " " + message);
    this.sendOthers(this.username + " just joined the chat!");
  }
}