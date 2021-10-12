package com.lti.selendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\LTI\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tshirts");
//		driver.findElement(By.name("field-keywords")).sendKeys("Iphone 13");
//		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("TshitS");
		driver.get("https://www.facebook.com/");
	//	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc");
		//driver.findElement(By.xpath("//*[@id='email' and @type = 'text']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id='email' or @type = 'text']")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		
		
	}

}
