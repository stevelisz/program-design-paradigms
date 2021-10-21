package server;

import java.io.Closeable;
import java.io.IOException;

import java.io.Closeable;

public class CloseUtil {

	public static void closeAll(Closeable... closeables) {
		for(Closeable c:closeables) {
			try {
				if(c!=null) {
					c.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}