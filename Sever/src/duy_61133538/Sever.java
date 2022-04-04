package duy_61133538;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	public static void main(String[] args) throws IOException {
		ServerSocket socketserver = new ServerSocket(3838);
		System.out.print("I'm listening on port number 3838");
		int id=0;
		while(true) {
			Socket s = socketserver.accept();
			id++;
			dichso luongTask = new dichso(s,id);
			luongTask.start();
		}
	}
}
