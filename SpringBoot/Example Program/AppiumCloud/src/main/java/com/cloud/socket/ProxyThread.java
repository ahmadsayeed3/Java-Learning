package com.cloud.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import com.cloud.boot.CloudBoot;

public class ProxyThread extends Thread {
	private Socket socketObject = null;
	private static final int BUFFER_SIZE = 1024;
	private URL cloudEndpoint;
	private String header;
	private String body;
	
	public ProxyThread(Socket eclipseSocket) {
		this.socketObject = eclipseSocket;
	}

	public void run() {
		System.out.println("=================== New Thread started ===============" + Thread.currentThread().getName());
		try {
			this.mainRunner();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void mainRunner() throws IOException, ParseException {
		this.setHeader();
		String response = this.forwardToSpringBoot();
		System.out.println("Response#1: " + response);
	}
	
	private void setHeader() throws IOException, ParseException {
		this.header = "";
		BufferedReader eclipseInReader = new BufferedReader(
				new InputStreamReader(this.socketObject.getInputStream(), StandardCharsets.UTF_8));
		String line = null;
		while ((line = eclipseInReader.readLine()) != null) {
			line = line + "\r\n";
			if (line.isEmpty() || line.contentEquals("\r\n")) {
				System.out.println("Header reddddd: " + this.header);
				this.setBody(eclipseInReader);
				break;
			}
				
			this.header += line;
		}
		this.header.trim();
	}
	
	private void setBody(BufferedReader eclipseInReader) throws IOException {
		String line = null;
		this.body = "";
		System.out.println("Body.....reding");
		while (true) {
			CharBuffer buffer = CharBuffer.allocate(ProxyThread.BUFFER_SIZE);
			int charactersRead = eclipseInReader.read(buffer);
			line = new String(buffer.array());
			System.out.println("Reading: " + body);
			this.body += line;
			if (charactersRead < ProxyThread.BUFFER_SIZE) {
				break;
			}
			
		}
		this.body.trim();
		System.out.println("Ended Happ");
	}
	
	private String forwardToSpringBoot() throws MalformedURLException, UnknownHostException {
		this.cloudEndpoint = this.getCloudEndPoint();
		return this.doPostApi();
	}
	
	private URL getCloudEndPoint() throws MalformedURLException, UnknownHostException {

		URL endpoint = CloudBoot.getInstance().getEndpoint();
		System.out.println(endpoint);
		return endpoint;
	}
	
	@SuppressWarnings("unchecked")
	private String doPostApi() {
		RestTemplate restTemplate = new RestTemplate();
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("header", this.header);
		jsonObject.put("body", this.body);
		HttpEntity<JSONObject> request = new HttpEntity<>(jsonObject);
		String response = restTemplate.postForObject(this.cloudEndpoint.toString(), request, String.class);
		
		return response;
	}
	
	private void callGETApi() {

		try {
			RestTemplate restTemplate = new RestTemplate();
			JSONObject result = restTemplate.getForObject("http://localhost:9700/status", JSONObject.class);
			System.out.println("RESSS: " + result.toJSONString());
		} catch (Exception e) {
			System.out.println("Server not started. need to start.");
		}
	}
}
