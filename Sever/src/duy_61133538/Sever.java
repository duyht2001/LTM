package duy_61133538;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket socketServer = new ServerSocket(8686);
		System.out.print("Tôi lắng nghe trong cổng 8686  ...");
		int id =0;
		while(true) {
			Socket s = socketServer.accept();
			//new Luong(s, id++).start();
			Luong luongTask = new Luong(s, id);
			luongTask.start();
		}
	}
}
