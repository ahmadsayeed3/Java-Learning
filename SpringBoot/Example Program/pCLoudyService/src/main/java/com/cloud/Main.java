package com.cloud;

import java.net.MalformedURLException;
import java.net.UnknownHostException;

import com.cloud.boot.CloudConnection;

public class Main {
	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		System.out.println(CloudConnection.getInstance().getEndPoint());
	}
}
