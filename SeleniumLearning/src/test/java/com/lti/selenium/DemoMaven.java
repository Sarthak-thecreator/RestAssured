package com.lti.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMaven {

	public static void main(String[] args) 
	{
		//System.getProperty("webdriver.chrome.driver", "C:\\Users\\personal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tshirts");
		//driver.findElement(By.name("field-keywords")).sendKeys("Mobiles");
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("sarthak.dubey1208@gmail");
		
	}

}
