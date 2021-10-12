package com.google;
import static org.junit.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffJUnit {
	
		WebDriver driver = null ;
		String browser, URL;
		@Before
		public void readproperty() throws Exception {
			
			FileInputStream fis = new FileInputStream("Resources\\config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			
			 browser = prop.getProperty("browser");
			
			URL = prop.getProperty("URL");
			fis.close();
		//	setup(browser,URL);
			
			
		}
		
		@Before
		
		public void setup() throws InterruptedException 
		{
			switch(browser){
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
				
			case "Edge":

				System.setProperty("webdriver.edge.driver", "Resources\\msedgedriver.exe");
				driver = new EdgeDriver();
				break;
			}	
			driver.get(URL);
			//rediffmailLinkTest();
		}

		
		@Test
	public void rediffmailLinkTest() throws InterruptedException 
		{
			driver.findElement(By.linkText("Rediffmail")).click();
			String navURL = driver.getCurrentUrl();
			assertEquals("Fail","https://mail.rediff.com/cgi-bin/login.cgi", navURL);
			
			
			/*if (navURL.equals("https://mail.rediff.com/cgi-bin/login.cgi"))
				System.out.println("Pass");
			else 
				System.out.println("Fail");*/
		//	loginTest();
			//orderOfCursor();
		}
	
		@After
	public void teardown()
		{
			
			driver.quit();
		}
	}