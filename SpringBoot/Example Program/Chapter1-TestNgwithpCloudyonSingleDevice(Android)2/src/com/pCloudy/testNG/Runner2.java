package com.pCloudy.testNG;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Runner2 {

	AppiumDriverLocalService service;
	AppiumDriver<WebElement> driver;
	String folder_name;
	DateFormat df;

	@BeforeTest
	public void setUpSuite() throws Exception {

	}

	@Parameters({ "deviceName" })
	@BeforeMethod
	public void prepareTest(String deviceName) throws IOException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("pCloudy_Username", "ahmad.sayeed@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "5nrybdvcntpd68sg2rz5nhp5");
		capabilities.setCapability("pCloudy_ApplicationName", "pCloudyAppiumDemo.apk");
		capabilities.setCapability("pCloudy_DurationInMinutes", 10);
		capabilities.setCapability("pCloudy_DeviceManafacturer", "Samsung");
		capabilities.setCapability("newCommandTimeout", 600);
		capabilities.setCapability("launchTimeout", 90000);
		capabilities.setCapability("appPackage", "com.pcloudy.appiumdemo");
		capabilities.setCapability("appActivity", "com.ba.mobile.LaunchActivity");
//		capabilities.setCapability("tag", "Booking Tag");
//		capabilities.setCapability("name", "Flight Search");
//		capabilities.setCapability("build", "Flight Booking");
//		driver = new AndroidDriver(new URL("https://tls.pcloudy.com/appiumcloud/wd/hub"), capabilities);
		driver = new AndroidDriver(new URL("http://localhost:1234/wd/hub"), capabilities);
		System.out.println("Driver Started");
	}

	@Test(invocationCount = 1)
	public void Test() throws IOException, InterruptedException {
		TestMethod();
	}

	public void TestMethod() throws IOException, InterruptedException {
		try {
			
			Thread.sleep(5 * 1000);
			driver.installApp("walmart.apk");
			Thread.sleep(200 * 1000);
//			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept']")).click();
//			driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/flightButton']")).click();
//			driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerfrom']")).click();
//			driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Bangalore, India (BLR)']")).click();

		} catch (Exception e) {
			System.out.println("Exception in test case");
		}
	}

	@AfterMethod
	public void endTest() throws IOException, InterruptedException {
		driver.executeScript("pCloudy_setStatus", "Error");
		driver.quit();
	}
}