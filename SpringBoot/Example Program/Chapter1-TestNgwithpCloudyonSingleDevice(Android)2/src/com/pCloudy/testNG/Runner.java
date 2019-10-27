package com.pCloudy.testNG;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cloud.boot.CloudBoot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Runner {

	AppiumDriverLocalService service;
	AppiumDriver<WebElement> driver;
	String folder_name;
	DateFormat df;

	@BeforeTest
	public void setUpSuite() throws Exception {

	}

	@BeforeMethod
	public void prepareTest() throws IOException, InterruptedException {

		CloudBoot appiumCloud = new CloudBoot();
		URL endpoint = appiumCloud.getEndpoint();
		System.out.println(endpoint);
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("pCloudy_Username", "ahamd.sayeed@sstsinc.com");
		capabilities.setCapability("pCloudy_ApiKey", "s6bxrj8jgmyz848k6h4my3k9");
		capabilities.setCapability("pCloudy_ApplicationName", "pCloudyAppiumDemo.apk");
		capabilities.setCapability("pCloudy_DurationInMinutes", 10);
		capabilities.setCapability("pCloudy_DeviceManafacturer", "Samsung");
		capabilities.setCapability("pCloudy_DeviceVersion", "8.0.0");
//		capabilities.setCapability("pCloudy_DeviceFullName", "Samsung_GalaxyA9_Android_8.0.0");
		capabilities.setCapability("newCommandTimeout", 2000);
		capabilities.setCapability("launchTimeout", 90000);
//		capabilities.setCapability("pCloudy_PreBook", true);
		capabilities.setCapability("appPackage", "com.pcloudy.appiumdemo");
		capabilities.setCapability("appActivity", "com.ba.mobile.LaunchActivity");
//		driver = new AndroidDriver(new URL("http://localhost:1234/wd/hub"), capabilities);
//		driver = new AndroidDriver(new URL("https://provident-ust.pcloudy.com/appiumcloud/wd/hub"), capabilities);
//		driver = new AndroidDriver(new URL("https://capgemini.pcloudy.com/appiumcloud/wd/hub"), capabilities);
//		driver = new AndroidDriver(new URL("https://private-live.pcloudy.com/appiumcloud/wd/hub"), capabilities);
//		driver = new AndroidDriver(new URL("https://device.pcloudy.com/appiumcloud/wd/hub"), capabilities);
		System.out.println("Going to send");
		driver = new AndroidDriver(endpoint, capabilities);
		System.out.println("Driver Started");
	}

	@Test
	public void Test() throws IOException, InterruptedException {
		System.out.println();
//		Thread.sleep(10 * 1000);
		// Click on Accept button
//        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/accept']")).click();
//		captureScreenShots();
//		String output = driver.executeScript("pCloudy_shapeNetworkSimulation", "3G-Average").toString();
//		System.out.println("Output: " + output);
//		output = driver.executeScript("pCloudy_shapeNetworkSimulation", "3G-Average").toString();
//		System.out.println("Output: " + output);
//		
//		Thread.sleep(20 * 1000);
//		driver.runAppInBackground(Duration.ofMillis(5 * 1000));
//		System.out.println("Goint to active");
//		((StartsActivity) driver).currentActivity();
		
//        //Click on Flight button
//        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/flightButton']")).click();
//        captureScreenShots();
//        
//        
////        Select from location
//        driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerfrom']")).click();
//        captureScreenShots();
//	    driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Bangalore, India (BLR)']")).click();
//	    captureScreenShots();
//		
//	    //Select to location
//	    driver.findElement(By.xpath("//android.widget.Spinner[@resource-id='com.pcloudy.appiumdemo:id/spinnerto']")).click();
//	    captureScreenShots();
//        driver.findElement(By.xpath("//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='Pune, India (PNQ)']")).click();
//        captureScreenShots();
//               
//        //Select one way trip
//        driver.findElement(By.xpath("//android.widget.RadioButton[@resource-id='com.pcloudy.appiumdemo:id/singleTrip']")).click();
//        
//        //Select departure time
//        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.pcloudy.appiumdemo:id/txtdepart']")).click();
//        captureScreenShots();
//        driver.findElement(By.xpath("//android.widget.Button[@resource-id='android:id/button1' and @text='OK']")).click();
//        captureScreenShots();
//        
//        //Click on search flights button
//        driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.pcloudy.appiumdemo:id/searchFlights']")).click();
//        captureScreenShots();
	}

	@AfterMethod
	public void endTest() throws IOException {

		driver.quit();
	}

	// Capture screenshot
	public void captureScreenShots() throws IOException {
		folder_name = "screenshot";
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Date format for screenshot file name
		df = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// create dir with given folder name
		new File(folder_name).mkdir();
		// Setting file name
		String file_name = df.format(new Date()) + ".png";
		// copy screenshot file into screenshot folder.
		FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
	}
}
