package com.simple.appium.Program;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.cloud.AppiumCloudServices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Hello world!
 *
 */
public class App {
	
	static AppiumDriver<WebElement> driver;


	public static void main(String[] args) throws IOException, InterruptedException {
		
		URL endpoint = AppiumCloudServices.getInstance().getEndPoint();
		System.out.println("EndPoint: " + endpoint.toString());
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setCapability("pCloudy_Username", "ahmad.sayeed@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "s6bxrj8jgmyz848k6h4my3k9");
		capabilities.setCapability("pCloudy_ApplicationName", "pCloudyAppiumDemo.apk");
		capabilities.setCapability("pCloudy_DurationInMinutes", 10);
		capabilities.setCapability("pCloudy_DeviceManafacturer", "Samsung");
		capabilities.setCapability("pCloudy_DeviceVersion", "8.0.0");
//		capabilities.setCapability("pCloudy_DeviceFullName", "Samsung_GalaxyA9_Android_8.0.0");
		capabilities.setCapability("newCommandTimeout", 2000);
		capabilities.setCapability("launchTimeout", 90000);
		capabilities.setCapability("appPackage", "com.pcloudy.appiumdemo");
		capabilities.setCapability("appActivity", "com.ba.mobile.LaunchActivity");
//
		System.out.println("#Going to send");
		driver = new AndroidDriver(endpoint, capabilities);
//		driver = new AndroidDriver(endpoint, capabilities);
		System.out.println("#Driver Started");
		
		
	}
}
