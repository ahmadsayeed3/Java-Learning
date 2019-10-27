package com.cloud.enums;

public enum CONTROLLER {
	
	MAIN(NAMES.MAIN), STATUS(NAMES.STATUS);
	
	public static class NAMES{
		public static final String PREFIX = "/cloud";
		public static final String MAIN = PREFIX + "/pCloudy";
		public static final String STATUS = MAIN + "/status";
	}
	
	private String value;
	private CONTROLLER(String value) {
		this.value = value;
	}
	
	public String getVal() {
		return this.value;
	}
}
