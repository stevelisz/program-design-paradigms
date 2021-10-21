package client;

import java.io.Closeable;
import java.io.IOException;

import java.io.Closeable;

/**
 * This class simply provides a static method to close all the closables.
 */
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
