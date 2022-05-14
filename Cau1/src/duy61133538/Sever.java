package duy61133538;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(8888);
		System.out.print("I'm listening on port number 8888");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
			id++;
			phanbietso luongTask = new phanbietso(s,id);
			luongTask.start();
		}
	}



}
