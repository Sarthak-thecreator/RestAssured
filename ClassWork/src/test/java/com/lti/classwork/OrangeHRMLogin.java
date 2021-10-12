package com.lti.classwork;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.*;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class OrangeHRMLogin
{
	WebDriver driver;
  @Test
  public void TestCase1() 
  {
	  System.out.println("TestCase1");
	  driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.name("btnLogin")).click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterMethod
  public void afterMethod()throws IOException
  {
	  TakesScreenshot screenshot=((TakesScreenshot)driver);
		File Srcfile=screenshot.getScreenshotAs(OutputType.FILE);
      File Destfile= new File("C:\\Users\\personal\\workspace\\ClassWork\\src\\test\\resources\\Screenshots\\facebook.jpg");
      FileUtils.copyFile(Srcfile, Destfile);
  }



}

