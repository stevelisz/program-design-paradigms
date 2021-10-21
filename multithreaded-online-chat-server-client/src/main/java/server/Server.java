package server;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class Server {
	public static ConcurrentHashMap<String, ClientPath> clientPathHashMap = new ConcurrentHashMap<>();

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		System.out.println("Server starting...");

		while(true) {
			System.out.println("Accepting clients connection...");
			Socket client = server.accept();
			ClientPath clientPath = new ClientPath(client);
			System.out.println(clientPath.getUsername()+" just connected.");
			System.out.println("--------------------------");
			System.out.println("Current online users:");
			for(String userName: clientPathHashMap.keySet()){
				System.out.println(userName);
			}
			System.out.println("--------------------------");
			new Thread(clientPath).start();
		}
	}

}
