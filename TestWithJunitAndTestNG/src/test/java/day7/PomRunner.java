package day7;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.testng.annotations.AfterTest;

public class PomRunner 
{
	WebDriver driver;
	LoginPage lp;
	@Test
	public void forgetLinktest()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		LoginPage lp=new LoginPage(driver);
		lp.clickForget();
		Assert.assertTrue(driver.getCurrentUrl().contains("requestPassCode"));
	}
	@Test(dependsOnMethods="forgetLinkTest")
	public void cancelButtonTest()
	{
		ForgetPage fp=new ForgetPage(driver);
		fp.doCancel();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
	@Test(dependsOnMethods="cancelButtonTest")
	public void loginTest()
	{
		lp.doLogin("admin","admin123");
		new DashBoardPage(driver).doLogout();
		Assert.assertTrue(driver.getCurrentUrl().contains("login"));
	}
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	  driver=new ChromeDriver();
	  
  }

  @AfterTest
  public void afterTest() throws Exception
  {
	  Thread.sleep(2000);
	  driver.quit();	
  }

}
