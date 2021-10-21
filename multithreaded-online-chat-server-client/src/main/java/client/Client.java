package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * This class represents Client object and is multithreaded for sending and receiving message.
 */
public class Client {
	private static String userName = "";
	public static String getUserName(){
		return userName;
	}

	/**
	 * main method to start a client.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("------Client Starting...------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //to get username from user.
		System.out.println("Please enter a username:");
		userName = br.readLine();
		Socket client = new Socket("localhost",9999);
		new Thread(new Send(client,userName)).start(); //start a new send thread and send the username alone together with socket client.
		new Thread(new Receive(client)).start();
	}
}