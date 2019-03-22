// Echo Server

// Client side program:

import java.io.*;
import java.net.*;

public class MyClient{
	
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	
	public MyClient(){
		
		try{
			
			//s = new Socket("2405:204:1026:72c5:3545:d508:642e:8699",10);
			//s = new Socket("192.168.43.37",12);	
			s = new Socket("192.168.43.30",10);		// Rishi
			//s = new Socket("localhost",10);		// providing server details, IP address and Port Number
			System.out.println(s);
			
			// opening Input and Output stream...
			dis = new DataInputStream( s.getInputStream());		// It will connect with Server OutputStream...
			dos = new DataOutputStream(s.getOutputStream());	// It will connect with server InputStream
			
			//Calling clientChat();
			clientChat();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void  clientChat() throws IOException{
		/* Accepting input from keyboard but System.in gives data in bytes 
		so also converting byte data into char with the help of InputStreamReader.*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1;
		do{
			
			s1 = br.readLine();		// reading data line by line from user...
			dos.writeUTF(s1);			// writing data at DataOutputStream line by line...
			dos.flush();
			
			// Retrieving Server Message
			System.out.println("Server: " + dis.readUTF());
		}while(!s1.equals("stop"));
	}
	
	public static void main(String...a){
		new MyClient();
	}
}