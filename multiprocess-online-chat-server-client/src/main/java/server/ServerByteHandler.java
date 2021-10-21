package server;

public class ServerByteHandler {

  public static String handleString(String str){
    StringBuilder stringBuilder = new StringBuilder();
    byte[] bytes = str.getBytes();
    for (int i=0; i<bytes.length; i++) {
      char c = (char) bytes[i];
      stringBuilder.append(c);
    }
    return stringBuilder.toString();
  }
  public static String handleBytes(byte[] bytes){
    return new String(bytes);
  }
}
