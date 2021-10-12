package day8;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class KeyRunner {
	WebDriver driver;
  @Test
  public void run() throws IOException {
	  
	  KeyWords keyword = new KeyWords(driver);
	  keyword.getUrl("https://www.google.com/");
	  keyword.type("name", "q", "selenium");
	  keyword.click("name", "btnK");
	  keyword.getSnap("1.png");
  }
  @BeforeTest
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterMethod() throws Exception {
		Thread.sleep(3000); 
		driver.quit();
	}
}
