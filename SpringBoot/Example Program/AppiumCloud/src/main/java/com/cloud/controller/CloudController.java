package com.cloud.controller;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.enums.API;



@RestController
public class CloudController {
	
	public CloudController() {
		
	}
	
    @PostMapping(path = API.Names.CLOUD_BOOT)
    public String appiumCloud(@RequestHeader HashMap<String, String> header, @RequestBody JSONObject body) {
       System.out.println("Request:" + body.toString());
       
       System.out.println("Header Size: " + header.size());
       
       for(String key: header.keySet()) {
    	   System.out.println(key + ":" + header.get(key));
       }
    	// do it
    	return "Hello World";
    }
    
    @RequestMapping(value = "/status", method = RequestMethod.GET)
	public JSONObject hello() throws InterruptedException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("status", true);
    	return jsonObject;
	}
}
