package com.lti.TestNG2;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.*;
import org.apache.commons.io.FileUtils;
public class BaseClass 
{
	WebDriver driver;
	 public void launchApp() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");  
	  }
	  

	  @AfterMethod
	  public void closeApp() throws IOException {
		  TakesScreenshot screenshot = ((TakesScreenshot)driver);
		  File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		  File destFile = new File("C:\\Users\\personal\\workspace\\ClassWork\\src\\test\\resources\\Screenshots\\facebook.jpg");
		  FileUtils.copyFile(srcFile, destFile);
		  driver.close();
	  }

}
