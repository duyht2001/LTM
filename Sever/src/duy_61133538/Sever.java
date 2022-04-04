package duy_61133538;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
	  public final static int SERVER_PORT = 7;
	  
	    public static void main(String[] args) throws IOException {
	        ServerSocket serverSocket = null;
	        try {
	            System.out.println("Binding to port " + SERVER_PORT + ", please wait  ...");
	            serverSocket = new ServerSocket(SERVER_PORT);
	            System.out.println("Server started: " + serverSocket);
	            System.out.println("Waiting for a client ...");
	            while (true) {
	                try {
	                    Socket socket = serverSocket.accept();
	                    System.out.println("Client accepted: " + socket);
	 
	                    OutputStream os = socket.getOutputStream();
	                    InputStream is = socket.getInputStream();
	                    int ch = 0;
	                    while (true) {
	                        ch = is.read(); // Receive data from client
	                        if (ch == 1) {
	                        	System.out.println{"one"};
	                        } else if (ch == 2) {
	                        	System.out.println{"two"};
							}else if (ch == 3) {
	                        	System.out.println{"three"};
							}else if (ch == 4) {
	                        	System.out.println{"four"};
							}else if (ch == 5) {
	                        	System.out.println{"five"};
							}else if (ch == 6) {
	                        	System.out.println{"six"};
							}else if (ch == 7) {
	                        	System.out.println{"seven"};
							}else if (ch == 8) {
	                        	System.out.println{"eight"};
							}else if (ch == 9) {
	                        	System.out.println{"nice"};
							}else if (ch == 0) {
	                        	System.out.println{"zero"};
							}
	                        os.write(ch); // Send the results to client
	                    }
	                    socket.close();
	                } catch (IOException e) {
	                    System.err.println(" Connection Error: " + e);
	                }
	            }
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        } finally {
	            if (serverSocket != null) {
	                serverSocket.close();
	            }
	        }
	    }
}
