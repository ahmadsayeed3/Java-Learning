package com.cloud.socket;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.net.UnknownHostException;

import com.cloud.boot.CloudConnection;
import com.cloud.enums.Server;

public class SocketConnection {

	private static SocketConnection instance;
	private String host;
	private int port;
	private URL endpoint;
	
	private SocketConnection() {
		// private
	}
	
	public static SocketConnection getInstance() {
		if(SocketConnection.instance == null) {
			SocketConnection.instance = new SocketConnection();
		}
		
		return SocketConnection.instance;
	}

	public URL getEndPoint() throws IOException, InterruptedException {
		if (this.endpoint == null) {
			this.setEndpoint();
			this.setSocket();
		}

		return this.endpoint;
	}

	private void setEndpoint() throws MalformedURLException, UnknownHostException {
		this.host = Server.HOST.getHost();
		this.port = Server.PORT_SOCKET.getInteger();
		this.endpoint = new URL(this.host + ":" + this.port);
	}

	private void setSocket() throws IOException, InterruptedException {
		new SetSocket(this.host, this.port).start();
		Thread.sleep(1000);
	}
	
	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		System.out.println(CloudConnection.getInstance().getEndPoint());
		System.out.println(CloudConnection.getInstance().getEndPoint());
	}
}

class SetSocket extends Thread {

	String host;
	int port;

	public SetSocket(String host, int port) {
		this.host = host;
		this.port = port;
	}

	@Override
	public void run() {

		try {
			boolean listening = true;

			ServerSocket serverSocket = new ServerSocket(this.port);
			System.out.println("AppiumCloud Started on " + port);

			while (listening) {
				try {
					new ProxyThread(serverSocket.accept()).start();

				} catch (IOException e) {
					e.printStackTrace();
					System.exit(-1);
				}
			}

			serverSocket.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
