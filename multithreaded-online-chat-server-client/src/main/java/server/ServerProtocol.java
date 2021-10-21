package server;

import com.GrammarManager;
import java.util.Map;

/**
 * server protocol to process incoming requests.
 */
public class ServerProtocol {

  public static final int CONNECT_MESSAGE = 19;
  public static final int DISCONNECT_MESSAGE = 21;
  public static final int QUERY_CONNECTED_USERS = 22;
  public static final int SEND_INSULT = 27;
  public static final int BROADCAST_MESSAGE = 24;
  public static final int DIRECT_MESSAGE = 25;

  public static final int QUERY_USER_RESPONSE = 23;
  public static final int CONNECT_RESPONSE = 20;
  public static final int FAILED_MESSAGE = 26;
  public static final String beingLoggedOff = "is being logged off....";
  public static final String noLongerConnected = "Looks like you are no longer connected.";
  public static final String saysToEveryone = " says to everyone:";
  public static final String DMed = " DMed you:";
  private int identifier;
  private int usernameSize;
  private byte[] username;

  public ServerProtocol() {

  }

  public ServerProtocol(int identifier, int usernameSize, byte[] username) {
    this.identifier = identifier;
    this.usernameSize = usernameSize;
    this.username = username;
  }

  /**
   * processing incoming requests.
   *
   * @param newLine incoming requests from clients.
   * @return response or directly handle if no response is required.
   */
  public static String processClientMessage(String newLine) {
    String[] lineParts = newLine.split(" ");
    String message = "";
    if (Integer.parseInt(lineParts[0]) == CONNECT_MESSAGE) {
      message = newLine;
    } else if (Integer.parseInt(lineParts[0]) == DISCONNECT_MESSAGE) {
      message = generateDisconnectResponse(newLine);
    } else if (Integer.parseInt(lineParts[0]) == DIRECT_MESSAGE) {
      handleDmMessage(newLine);
    } else if (Integer.parseInt(lineParts[0]) == BROADCAST_MESSAGE) {
      handleBroadcastMessage(newLine);
    } else if (Integer.parseInt(lineParts[0]) == QUERY_CONNECTED_USERS) {
      message = generateQueryResponse(newLine);
    } else if (Integer.parseInt(lineParts[0]) == DISCONNECT_MESSAGE) {
      message = generateDisconnectResponse(newLine);
    } else if (Integer.parseInt(lineParts[0]) == SEND_INSULT) {
      generateInsult(newLine);
    }
    return message;
  }

  /**
   * generate disconnect response and disconnect the user.
   *
   * @param newLine incoming request.
   * @return response.
   */
  public static String generateDisconnectResponse(String newLine) { //21 1 b
    String[] lineParts = newLine.split(" ");
    String username = lineParts[2];
    StringBuilder disconnectResponse = new StringBuilder();
    disconnectResponse.append(CONNECT_RESPONSE).append(" ");
    if (Server.clientPathHashMap.containsKey(username)) {
      String message = beingLoggedOff;
      disconnectResponse.append(message.length()).append(" ");
      disconnectResponse.append(ServerByteHandler.handleBytes(message.getBytes()));
    } else {
      String message = noLongerConnected;
      disconnectResponse.append(message.length()).append(" ");
      disconnectResponse.append(ServerByteHandler.handleBytes(message.getBytes()));
    }
    Server.clientPathHashMap.remove(username);
    System.out.println(disconnectResponse.toString());
    return disconnectResponse.toString();
  }

  /**
   * handle broadcast message.
   *
   * @param newLine incoming requests.
   */
  public static void handleBroadcastMessage(String newLine) { //24 1 a 8 helloall
    String[] lineParts = newLine.split(" ");
    StringBuilder message = new StringBuilder();
    if (Server.clientPathHashMap.containsKey(lineParts[2])) {
      message.append(lineParts[2] + saysToEveryone);
      for (int i = 4; i < lineParts.length; i++) {
        message.append(lineParts[i]).append(" ");
      }
      Server.clientPathHashMap.get(lineParts[2]).sendAll(new String(message).trim());
    } else {
      Server.clientPathHashMap.get(lineParts[2]).send(
          FAILED_MESSAGE + " " + "broadcast request failed".length() + " " + ServerByteHandler
              .handleBytes("broadcast request failed".getBytes()));
    }
  }

  /**
   * handle direct message requests.
   *
   * @param newLine DM requests.
   */
  public static void handleDmMessage(String newLine) {//25 3 ccc 3 bbb 5 nihao
    String[] lineParts = newLine.split(" ");
    StringBuilder message = new StringBuilder();
    if (Server.clientPathHashMap.containsKey(lineParts[2]) && (Server.clientPathHashMap
        .containsKey(lineParts[4]))) {
      message.append(lineParts[2]).append(DMed);
      for (int i = 6; i < lineParts.length; i++) {
        message.append(lineParts[i]).append(" ");
      }
      Server.clientPathHashMap.get(lineParts[4]).send(new String(message).trim());
    } else {
      Server.clientPathHashMap.get(lineParts[2]).send("either the sender or the recipient is not connected".trim());
    }
  }

  /**
   * generate query response.
   *
   * @param newLine query request.
   * @return query response.
   */
  public static String generateQueryResponse(String newLine) { //22 3 ccc
    String[] lineParts = newLine.split(" ");
    StringBuilder queryResponse = new StringBuilder();
    queryResponse.append(QUERY_USER_RESPONSE).append(" ");
    queryResponse.append(Server.clientPathHashMap.keySet().size()).append(" ");
    for (Map.Entry<String, ClientPath> entry : Server.clientPathHashMap.entrySet()) {
      if (!entry.getKey().equals(lineParts[2])) {
        queryResponse.append(entry.getKey().length()).append(" ");
        queryResponse.append(ServerByteHandler.handleBytes(entry.getKey().getBytes())).append(" ");
      }
    }
    return queryResponse.toString();
  }

  /**
   * handle insult request.
   *
   * @param newLine insult request.
   */
  public static void generateInsult(String newLine) {
    GrammarManager grammarManager = new GrammarManager("./grammars");
    String[] lineParts = newLine.split(" ");
    StringBuilder message = new StringBuilder();
    message.append(lineParts[2]).append("->").append(lineParts[4]).append(" ");
    message.append(grammarManager.produce());
    System.out.println(message.toString());
    Server.clientPathHashMap.get(lineParts[2]).sendAll(new String(message));
  }
}
