package com.pCloudy.testNG;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PCloudy_API_Capability {

	AppiumDriver<WebElement> driver;
	Object output;

	@BeforeMethod
	public void prepareTest() throws IOException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("pCloudy_Username", "ahmad.sayeed@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "5nrybdvcntpd68sg2rz5nhp5");
		
		capabilities.setCapability("pCloudy_ApplicationName", "pCloudyAppiumDemo.apk");
		capabilities.setCapability("pCloudy_DurationInMinutes", 10);
		
		// 1. By Manufacturer
		capabilities.setCapability("pCloudy_DeviceManafacturer", "Samsung");
		
/* 		By Manufacturer & Version
			capabilities.setCapability("pCloudy_DeviceManufacturer", "Samsung");
			capabilities.setCapability("pCloudy_DeviceVersion", "8.0.0");
*/
		
/*		 By DeviceVersion
			capabilities.setCapability("pCloudy_DeviceVersion", "8.0.0");
			capabilities.setCapability("platformName", "Android");
*/
				
/* 		By Device Full Name
		   capabilities.setCapability("pCloudy_DeviceFullName", "Samsung_GalaxyA9_Android_8.0.0");
*/
		
//		capabilities.setCapability("pCloudy_PreBook", true);
		
		capabilities.setCapability("newCommandTimeout", 600);
		capabilities.setCapability("launchTimeout", 90000);
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("appPackage", "com.pcloudy.appiumdemo");
		capabilities.setCapability("appActivity", "com.ba.mobile.LaunchActivity");

		driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
	}

	@Test
	public void Test() {

//		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept']")).click();
//		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept' and @text='Accept']")).click();
//		driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerfrom']")).click();
//		driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Pune, India (PNQ)']")).click();
		
		
		// ADB Command
		driver.executeScript("pCloudy_executeAdbCommand", "adb devices");

		// Get Profiles For NetworkSimulation
		Object profileString = driver.executeScript("pCloudy_getNetworkSimulationProfiles");
		System.out.println("NetworkSimulationProfiles: " + profileString);

		// Shape Network Simulation
		// 2G-DevelopingRural,Cable,DSL,Edge-Average,Edge-Good,Edge-Lossy,NoConnectivity,2G-DevelopingUrban,3G-Average, 3G-Good,Broadband Low Speed,4G Data
		String[] profileArray = profileString.toString().split(",");
		driver.executeScript("pCloudy_shapeNetworkSimulation", profileArray[4]);
		
		// UnShape/Reset Network Simulation
		driver.executeScript("pCloudy_unShapeNetworkSimulation");

		// Set Android Location (latitude and longitude)
		driver.executeScript("pCloudy_setAndroidLocation", "1.2345d", "1.2345d");
		
		// Switch Device Location (Reset)
		driver.executeScript("pCloudy_switchDeviceLocation", "true");

	}

	@AfterMethod
	public void endTest() throws IOException {
		if (driver != null)
			driver.quit();
	}
}
