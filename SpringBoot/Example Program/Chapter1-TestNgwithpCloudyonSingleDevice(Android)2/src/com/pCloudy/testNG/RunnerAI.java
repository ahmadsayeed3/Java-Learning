//package com.pCloudy.testNG;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.List;
//
//import javax.xml.parsers.ParserConfigurationException;
//import javax.xml.xpath.XPathExpressionException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.xml.sax.SAXException;
//
//import com.ssts.pcloudy.AIHub.AppiumAI;
//import com.ssts.pcloudy.AIHub.finder.FinderAI;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
//
//public class RunnerAI {
//
//	AppiumDriverLocalService service;
//	AppiumDriver<WebElement> driver;
//	String folder_name;
//	DateFormat df;
//
//	@BeforeTest
//	public void setUpSuite() throws Exception {
//
//	}
//
//	@BeforeMethod
//	public void prepareTest() throws IOException, InterruptedException {
//
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//
//		capabilities.setCapability("pCloudy_Username", "ahmad.sayeed@sstsinc.com");
//		capabilities.setCapability("pCloudy_ApiKey", "5nrybdvcntpd68sg2rz5nhp5");
//		capabilities.setCapability("pCloudy_ApplicationName", "walmart.apk");
//		capabilities.setCapability("pCloudy_DurationInMinutes", 10);
//		capabilities.setCapability("pCloudy_DeviceManafacturer", "Samsung");
//		 capabilities.setCapability("pCloudy_DeviceVersion", "8.0.0");
//		// capabilities.setCapability("pCloudy_DeviceFullName",
//		// "Samsung_GalaxyTabA_Android_7.1.1");
////		capabilities.setCapability("pCloudy_DeviceFullName", "Samsung_GalaxyS10Plus_Android_9.0.0");
//		capabilities.setCapability("newCommandTimeout", 600);
//		capabilities.setCapability("launchTimeout", 90000);
//		capabilities.setCapability("appPackage", "com.walmart.android");
//		capabilities.setCapability("appActivity", ".app.main.MainActivity");
//		capabilities.setCapability("tag", "I am tag");
//		capabilities.setCapability("name", "I am name");
//		capabilities.setCapability("build", "I am build New");
////		driver = new AndroidDriver(new URL("http://tls.pcloudy.com/appiumcloud/wd/hub"), capabilities);
//		driver = new AndroidDriver(new URL("http://localhost:1234/wd/hub"), capabilities);
//		System.out.println("DRIVER STARTED..........");
//		Thread.sleep(10 * 1000);
//	}
//
//	@Test(invocationCount = 1)
//	public void Test() throws IOException, InterruptedException, XPathExpressionException, ParserConfigurationException, SAXException {
//		AppiumAI appiumAI = new AppiumAI(driver);
//		List<WebElement> elements = appiumAI.findElements("cart");
//		System.out.println("Elements Size: " + elements.size());
//		for(WebElement element: elements) {
//			System.out.println("Founded Element: " + element);
//		}
//		
//		elements.get(0).click();
//		Thread.sleep(15 * 1000);
//	}
//
//	@AfterMethod
//	public void endTest() throws IOException {
//		System.out.println("Tear Down");
//		driver.quit();
//	}
//
//	// Capture screenshot
//	public void captureScreenShots() throws IOException {
//		folder_name = "screenshot";
//		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		// Date format for screenshot file name
//		df = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
//		// create dir with given folder name
//		new File(folder_name).mkdir();
//		// Setting file name
//		String file_name = df.format(new Date()) + ".png";
//		// copy screenshot file into screenshot folder.
//		FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
//	}
//
//}