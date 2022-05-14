package duy61133538;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;


       
public class phanbietso extends Thread {
	Socket socketClient;
	int id = -1;
	

	public phanbietso(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
		
	}



	@Override
	public void run() {
		try {
			System.out.print(socketClient.getInetAddress().getHostAddress());
			System.out.print(id);
			
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter write2client = new OutputStreamWriter(osToClient);
			BufferedWriter buffW = new BufferedWriter(write2client);
			
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffR = new BufferedReader(inReader);
			
			while(true){
				
				String chuoiNhan=buffR.readLine();
				System.out.print(chuoiNhan);
				int a = Integer.parseInt("chuoiNhan");
				
				if(a%2 == 0) {
					String chuoiGui = "Day la so chan";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				
				}else if(a%2 != 0) {
					String chuoiGui= "Day la so le";
					buffW.write(chuoiGui+"\n");
					buffW.flush();
				}else if(chuoiNhan.equals("0")) {
					break;
				}
				
			}
			socketClient.close();
			
		}catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
	public void start() {
		// TODO Auto-generated method stub
		
	}
}

