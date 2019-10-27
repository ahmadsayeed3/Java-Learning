package com.cloud.enums;

public enum API {
	
	MAIN(NAMES.MAIN), STATUS(NAMES.STATUS);
	
	public static class NAMES{
		public static final String STATUS = SERVER.NAMES.getHostPort() + CONTROLLER.STATUS.getVal();
		public static final String MAIN = SERVER.NAMES.getHostPort() + CONTROLLER.MAIN.getVal();
	}
	
	
	private String value;
	API(String value){
		this.value = value;
	}
	
	public String getVal() {
		return this.value;
	}
}
