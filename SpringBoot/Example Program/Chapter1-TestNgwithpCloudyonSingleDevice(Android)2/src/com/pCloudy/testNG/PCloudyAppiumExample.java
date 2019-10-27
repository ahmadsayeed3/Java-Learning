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

public class PCloudyAppiumExample {

	AppiumDriver<WebElement> driver;
	Object output;

	@BeforeMethod
	public void prepareTest() throws IOException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		/* pCloudy_UserName and pCloudy_ApiKey is for user authentication. */
		capabilities.setCapability("pCloudy_Username", "ahmad.sayeed@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "5nfdhgsffh******sg2rz5nhp5");
		
		/* pCloudy_ApplicationName is about which application you want to work on */
		capabilities.setCapability("pCloudy_ApplicationName", "pCloudyAppiumDemo.apk");
		
		/* pCloudy_DurationInminutes is device booking duration. */
		capabilities.setCapability("pCloudy_DurationInMinutes", 10);

		/* pCloudy_DeviceFullName that defines which device you want to run your Appium script. */
		capabilities.setCapability("pCloudy_DeviceFullName", "Samsung_GalaxyA9_Android_8.0.0");

		/* Rests are the same typical Appium capabilities. */
		capabilities.setCapability("newCommandTimeout", 600);
		capabilities.setCapability("launchTimeout", 90000);
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("appPackage", "com.pcloudy.appiumdemo");
		capabilities.setCapability("appActivity", "com.ba.mobile.LaunchActivity");

		/* And finally the endpoint, instead of calling your local Appium, you call pCloudy endpoint.   */
		driver = new AndroidDriver<WebElement>(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
	}

	@Test
	public void Test() {
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept' and @text='Accept']")).click();
		driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerfrom']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Pune, India (PNQ)']")).click();
	}

	@AfterMethod
	public void endTest() throws IOException {
		if (driver != null)
			driver.quit();
	}
}