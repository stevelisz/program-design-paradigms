package client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Receive thread of client.
 */
public class Receive implements Runnable{
  private DataInputStream dis;
  private Socket client;
  private boolean flag;

  /**
   * constructor.
   * @param client socket client.
   */
  public Receive(Socket client) {
    this.flag = true;
    this.client = client;
    try {
      dis = new DataInputStream(client.getInputStream());
    } catch (IOException e) {
      flag = false;
      CloseUtil.closeAll(dis,client);
    }
  }

  /**
   * receive pure string message to be parsed/processed.
   * @return the message.
   */
  public String receive() {
    String msg = "";
    try {
      msg = dis.readUTF();
    } catch (IOException e) {
      flag = false;
      CloseUtil.closeAll(dis,client);
    }
    return msg;
  }

  @Override
  public void run() {
    while(flag) {
      String response = this.receive(); //receiving message.
      String message = ClientProtocol.processServerResponse(response); //process it.
      //if(!response.equals("") && !message.equals("")) {
      System.out.println(message);
      //}
    }
  }

}