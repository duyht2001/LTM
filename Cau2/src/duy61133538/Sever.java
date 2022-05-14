package duy61133538;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket socketServer = new ServerSocket(9999);
		System.out.print("Tôi lắng nghe trong cổng 9999  ...");
		int id =0;
		while(true) {
			Socket s = socketServer.accept();
			File luongTask = new File(s, id);
			luongTask.start();
		}
	}

}
