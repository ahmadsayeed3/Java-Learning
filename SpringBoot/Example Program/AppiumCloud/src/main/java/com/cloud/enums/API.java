package com.cloud.enums;

public enum API {
	STATUS(Names.STATUS), CLOUD_BOOT(Names.CLOUD_BOOT);
	
	 public class Names{
	        public static final String STATUS = "/status";
	        public static final String CLOUD_BOOT = "/appiumcloud";
	    }
	
	private final String value;
	
	private API(String value) {
		this.value = value;
	}
	
	public String getVal() {
		return this.value;
	}
}
