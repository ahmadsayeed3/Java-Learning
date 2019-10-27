package com.cloud;

import java.io.IOException;
import java.net.URL;

import com.cloud.socket.SocketConnection;

public class AppiumCloudServices {
	
	private static AppiumCloudServices instance;
	
	private AppiumCloudServices() {
		
	}
	
	public static AppiumCloudServices getInstance() {
		if(AppiumCloudServices.instance == null){
			AppiumCloudServices.instance = new AppiumCloudServices();
		}
		
		return AppiumCloudServices.instance;
	}
	
	public URL getEndPoint() throws IOException, InterruptedException {
		
		return SocketConnection.getInstance().getEndPoint();
	}
}
