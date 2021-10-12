package com.lti.TestNG2;

import java.io.IOException;
import org.testng.annotations.Test;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import java.io.*;
import org.apache.commons.io.FileUtils;
public class AmazonClass extends BaseClass 
{
	@Test(priority = 2)
	  public void Test() throws IOException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy A22");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String price = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span/span[2]/span[2]")).getText();
		System.out.println("Price of the Galaxy A22: "+price);
	}
	@Test(priority = 1)
	public void Test1() throws IOException {
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("sarthak123@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("pwd123");
		driver.findElement(By.id("signInSubmit")).click();
		
	}

}