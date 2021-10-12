package com.google;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class GoogleSearchPage 
{
	WebDriver driver=null;
	public void readproperty()throws FileNotFoundException,IOException
	{
		FileInputStream fis = new FileInputStream("Resources\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browser=prop.getProperty("browser");
		String URI=prop.getProperty("BaseURL");
		fis.close();
		setup(browser,URI);
		}
		public void setup(String browser,String URI)
	{
		switch(browser)
		{
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;

		case"chrome":
			System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
			driver=new ChromeDriver();	
			break;
		}
		driver.get("URI");
		titletest();
	}
	public void titletest()
	{
		System.out.println(driver.getTitle());
		teardown();
	}
	public void teardown()
	{
		
		driver.close();
	}
	public static void main(String[] args)throws Exception
	{
		
		GoogleSearchPage gsp=new GoogleSearchPage();
		gsp.readproperty();
		
		
	}

}
