package codility;

import static org.junit.Assert.*;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverTestCase 
{
	static WebDriver webDriver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		ChromeOptions op=new ChromeOptions(); //Used for doing some setting of Chrome Browser		
		op.addArguments("--headless");//For Headless
		webDriver = new ChromeDriver();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(3000);
		webDriver.quit();
	}

	

}
