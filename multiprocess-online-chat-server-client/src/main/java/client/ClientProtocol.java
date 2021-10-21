package client;

import java.io.DataOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import server.ClientPath;
import server.Server;
import com.GrammarManager;

/**
 * client protocol to process whatever is being sent from user or response from server.
 */
public class ClientProtocol {

  public static final int CONNECT_MESSAGE = 19;
  public static final int DISCONNECT_MESSAGE = 21;
  public static final int QUERY_CONNECTED_USERS = 22;
  public static final int SEND_INSULT = 27;
  public static final int BROADCAST_MESSAGE = 24;
  public static final int DIRECT_MESSAGE = 25;

  public static final int QUERY_USER_RESPONSE = 23;
  public static final int CONNECT_RESPONSE = 20;
  public static final int FAILED_MESSAGE = 26;



  /**
   * process message from user.
   *
   * @param newLine message from user.
   * @return request.
   */
  public static String processNewLine(String newLine) {
    String message = "";
    if (newLine.startsWith("@all")) {
      message = generateBroadCast(newLine);
    } else if (newLine.startsWith("@")) {
      message = generateDirectMessage(newLine);
    } else if (newLine.equals("who")) {
      message = generateQueryConnectedUsers(newLine);
    } else if (newLine.equals("logoff")) {
      message = generateDisconnectMessage(newLine);
    } else if (newLine.startsWith("!")) {
      message = generateInsult(newLine);
    }
    return message;
  }

  /**
   * process response from server.
   *
   * @param response response from server.
   * @return parsed readable information to user.
   */
  public static String processServerResponse(String response) {
    String[] lineParts = response.split(" ");
    String result = "";
    StringBuilder processedResponse = new StringBuilder();
    List<String> onlineOthers = new ArrayList<>();
    for (int i = 3; i < lineParts.length; i = i + 2) {
      onlineOthers.add(lineParts[i]);
    }
    if (lineParts[0].equals(Integer.toString(QUERY_USER_RESPONSE))) { //23 3 1 c 1 z
      processedResponse.append("There are ").append(lineParts[1])
          .append(" users online including you.");
      processedResponse.append(" They are: ").append(onlineOthers);
      result = processedResponse.toString();
    } else if (lineParts[0].equals(Integer.toString(CONNECT_RESPONSE))) {
      if (lineParts[1].equals("true")) { //check if it's connect response.
        result = "Welcome abroad, " + Client.getUserName() + "! ";
        for (int i = 3; i < lineParts.length; i++) {
          result += lineParts[i] + " ";
        }
      } else { //else it's disconnect response
        Server.clientPathHashMap.remove(Client.getUserName());
        for (int i = 2; i < lineParts.length; i++) {
          result += ClientByteHandler.handleString(lineParts[i]) + " ";
        }
        if (!Server.clientPathHashMap.containsKey(Client.getUserName())) {
          result = ("you are no longer connected. To join again, please restart the client.");
        }
      }
    } else if (lineParts[0].equals(Integer.toString(FAILED_MESSAGE))) {
      result = ClientByteHandler.handleString(lineParts[2]);
    } else {
      result = response;
    }
    return result.trim();
  }

  /**
   * generate insult request.
   *
   * @param newLine msg from user.
   * @return insult request.
   */
  public static String generateInsult(String newLine) {
    StringBuilder message = new StringBuilder();
    message.append(SEND_INSULT).append(" ");
    message.append(Client.getUserName().length()).append(" ");
    message.append(ClientByteHandler.handleBytes(Client.getUserName().getBytes())).append(" ");
    message.append(newLine.substring(1).length()).append(" ");
    message.append(ClientByteHandler.handleBytes(newLine.substring(1).getBytes())).append(" ");
    return message.toString();
  }

  /**
   * generate disconnect request.
   *
   * @param newLine msg from user.
   * @return disconnect request.
   */
  public static String generateDisconnectMessage(String newLine) {
    StringBuilder message = new StringBuilder();
    message.append(DISCONNECT_MESSAGE).append(" ");
    message.append(Client.getUserName().length()).append(" ");
    message.append(ClientByteHandler.handleBytes(Client.getUserName().getBytes()));
    return message.toString();
  }

  /**
   * generate query request
   *
   * @param newLine msg from user.
   * @return query request.
   */
  public static String generateQueryConnectedUsers(String newLine) {
    StringBuilder message = new StringBuilder();
    message.append(QUERY_CONNECTED_USERS).append(" ");
    message.append(Client.getUserName().length()).append(" ");
    message.append(ClientByteHandler.handleBytes(Client.getUserName().getBytes()));

    return message.toString();
  }

  /**
   * generate DM request
   *
   * @param newLine msg from user.
   * @return DM request.
   */
  public static String generateDirectMessage(String newLine) {
    StringBuilder message = new StringBuilder();
    message.append(DIRECT_MESSAGE).append(" ");
    message.append(Client.getUserName().length()).append(" ");
    message.append(ClientByteHandler.handleBytes(Client.getUserName().getBytes())).append(" ");
    message.append(newLine.substring(1, newLine.indexOf(" ")).length()).append(" ");
    message.append(
        ClientByteHandler.handleBytes(newLine.substring(1, newLine.indexOf(" ")).getBytes()))
        .append(" ");
    message.append(newLine.substring(newLine.indexOf(" ")).length() - 1).append(" ");
    message
        .append(ClientByteHandler.handleBytes(newLine.substring(newLine.indexOf(" ")).getBytes()));
    return message.toString();
  }

  /**
   * generate broadcast request.
   *
   * @param newLine msg from user.
   * @return broadcast request.
   */
  public static String generateBroadCast(String newLine) {
    StringBuilder message = new StringBuilder();
    message.append(BROADCAST_MESSAGE).append(" ");
    message.append(Client.getUserName().length()).append(" ");
    message.append(ClientByteHandler.handleBytes(Client.getUserName().getBytes())).append(" ");
    message.append(newLine.substring(newLine.indexOf(" ")).trim().length()).append(" ");
    message
        .append(ClientByteHandler.handleBytes(newLine.substring(newLine.indexOf(" ")).getBytes()));

    return message.toString();
  }

  /**
   * generate connect request.                                 
   *
   * @param username username of user.
   * @return connect request.
   */
  public static String generateConnectMessage(String username) {
    StringBuilder message = new StringBuilder();
    message.append(CONNECT_MESSAGE).append(" ");
    message.append(username.length()).append(" ");
    message.append(ClientByteHandler.handleBytes(username.getBytes()));

    return message.toString();
  }
}
