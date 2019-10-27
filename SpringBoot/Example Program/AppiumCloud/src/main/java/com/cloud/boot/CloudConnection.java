package com.cloud.boot;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cloud.enums.API;
import com.cloud.enums.Server;

public class CloudConnection {

	private static CloudConnection instance;
	private String url;

	private CloudConnection() throws UnknownHostException {
		this.url = Server.HOST.getHost() + ":" + Server.PORT_BOOT.getInteger() + API.CLOUD_BOOT.getVal();
	}

	public static CloudConnection getInstance() throws UnknownHostException {
		if (CloudConnection.instance == null) {
			CloudConnection.instance = new CloudConnection();
		}

		return CloudConnection.instance;
	}

	public URL getEndPoint() throws MalformedURLException, UnknownHostException {
		if (!this.isStarted()) {
			return CloudBoot.getInstance().getEndpoint();
		}
		System.out.println("Server already started no need to start.");
		return new URL(this.url);
	}

	private boolean isStarted() throws UnknownHostException {
		String urlStatus = Server.HOST.getHost() + ":" + Server.PORT_BOOT.getInteger() + API.STATUS.getVal();
		try {
			RestTemplate restTemplate = new RestTemplate();
			ResponseEntity<String> response = restTemplate.getForEntity(urlStatus, String.class);
			if (response.getStatusCode() == HttpStatus.OK) {
				return true;
			}
		} catch (Exception e) {
			System.out.println("Server not started. need to start.");
		}

		return false;
	}

	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		System.out.println(new CloudConnection().getEndPoint());
	}
}
