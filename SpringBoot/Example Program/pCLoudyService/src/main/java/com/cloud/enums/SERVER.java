package com.cloud.enums;

import java.net.InetAddress;
import java.net.UnknownHostException;

public enum SERVER {
	HOST(NAMES.HOST), PORT(NAMES.PORT);
	
	
	public static class NAMES{
		public static final String HOST = getHostPort();
		public static final String PORT = "9500";
		
		public static String getHostPort() {
			try {
				return "http://" + InetAddress.getLocalHost().getHostAddress() + ":" + NAMES.PORT;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			}
			return null;
		}
	}
	
	
	private String value;
	private SERVER(String value) {
		this.value = value;
	}
	
	public String getVal() {
		return this.value;
	}
}
