package com.cloud.boot;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cloud.enums.API;
import com.cloud.enums.SERVER;


@SpringBootApplication
@ComponentScan("com.cloud.controller")
public class CloudBoot implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>{

	private URL endpoint;
	private static CloudBoot instance;
	private ConfigurableApplicationContext applicationContext;
	
	
	public CloudBoot() {
		
	}
	
	public static CloudBoot getInstance() {
		if(CloudBoot.instance == null) {
			CloudBoot.instance = new CloudBoot();
		}
		return CloudBoot.instance;
	}
	
	public URL getEndpoint() throws MalformedURLException, UnknownHostException {
		if(this.endpoint == null) {
			this.startServer();
			this.setEndpoint(); 
		}
		return this.endpoint;
	}

	private void startServer() throws UnknownHostException {
		SpringApplication app = new SpringApplication(CloudBoot.class);
        app.setBannerMode(Banner.Mode.OFF);
        
		this.applicationContext = app.run();		
	}
	
	private void setEndpoint() throws MalformedURLException, UnknownHostException {
		this.endpoint = new URL(API.MAIN.getVal());
	}
	
	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		int port = Integer.parseInt(SERVER.PORT.getVal());
		factory.setPort(port);	
	}
	
	public static void main(String[] args) throws MalformedURLException, UnknownHostException {
		SpringApplication app = new SpringApplication(CloudBoot.class);
        app.setBannerMode(Banner.Mode.OFF);
		app.run();	
	}
}
