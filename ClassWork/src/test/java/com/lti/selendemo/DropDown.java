package com.lti.selendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDown {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Singh.DESKTOP-VM4G1KR\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				
				 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
				 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				 driver.findElement(By.id("btnLogin")).click();
				 
			     	 
			    driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
			    
				Select DayDropDown = new Select(driver.findElement(By.id("searchSystemUser[userType]")));  
				DayDropDown.selectByValue("20");
				
				driver.findElement(By.id("searchSystemUser[employeeName][empName]")).sendKeys("Sarthak Dubey");
				driver.findElement(By.id("searchSystemUser[userName]")).sendKeys("Sarthak12");
				Select YearDropDown = new Select(driver.findElement(By.id("searchSystemUser[status]")));  
				YearDropDown.selectByIndex(1);

			}


	}

