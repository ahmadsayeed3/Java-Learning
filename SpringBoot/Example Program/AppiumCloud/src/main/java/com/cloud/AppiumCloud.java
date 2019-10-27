package com.cloud;

import java.io.IOException;
import java.net.URL;

import com.cloud.socket.SocketConnection;

public class AppiumCloud {
	
	private static AppiumCloud instance;
	
	private AppiumCloud() {
		
	}
	
	public static AppiumCloud getInstance() {
		if(AppiumCloud.instance == null){
			AppiumCloud.instance = new AppiumCloud();
		}
		
		return AppiumCloud.instance;
	}
	
	public URL getEndPoint() throws IOException, InterruptedException {
		
		return SocketConnection.getInstance().getEndPoint();
	}
}
