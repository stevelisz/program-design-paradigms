package client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Send thread of client.
 */
public class Send implements Runnable {

  private BufferedReader br;
  private DataOutputStream dos;
  private Socket client;
  private boolean flag;
  private String username;
  private final String menu = "Possible commands are:\n"
      + "• logoff: log off\n"
      + "• who: show all users in the chat room\n"
      + "• @user: sends a direct message to the specified user\n"
      + "• @all: sends a broadcast message to the server, to be sent to all users connected\n"
      + "• !user: sends a random insult to the specified user";

  /**
   * constructor using following parameters.
   * @param client socket client
   * @param username username
   */
  public Send(Socket client, String username) {
    flag = true;
    this.client = client;
    this.username = username;
    br = new BufferedReader(new InputStreamReader(System.in));
    try {
      dos = new DataOutputStream(client.getOutputStream());
      //sending connect message
      this.send(ClientProtocol.generateConnectMessage(username)); // here should send connect message
    } catch (IOException e) {
      flag = false;
      CloseUtil.closeAll(dos, client);
    }
  }

  @Override
  public void run() {
    while (flag) {
      String message = this.getMessage(); //get processed message.
      if (!message.equals("")) {
        this.send(message); //send to this client.
      }
    }
  }

  /**
   * send message to certain client.
   * @param message message.
   */
  private void send(String message) {
    try {
      dos.writeUTF(message);
      dos.flush();
    } catch (IOException e) {
      flag = false;
      CloseUtil.closeAll(dos, client);
    }
  }

  /**
   * receive new message/response and process it using ClientProtocol.
   * @return
   */
  private String getMessage() {
    String message = "";
    String newLine = "";
    try {
      newLine = br.readLine();
      message = ClientProtocol.processNewLine(newLine); //process it
      if(message.equals("")){
        if(!newLine.equals("?")){
          System.out.println("Invalid Command.");
        }
        printMenu(); // print out possible commands if "?" is entered by user.
      }
    } catch (IOException e) {
      flag = false;
      CloseUtil.closeAll(dos, client);
    }
    return message;
  }

  private void printMenu() {
    System.out.println(this.menu);
  }
}