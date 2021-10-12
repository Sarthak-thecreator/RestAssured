package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import day7.ForgetPage;

public class FactoryRunner {
	
	WebDriver driver;
	
	
	@Test
	public void cancelButtonTest() 
	{
		ExtentReports ex= new ExtentReports();
		ex.attachReporter(new ExtentHtmlReporter("Orange.html"));
		ExtentTest tc=ex.createTest("ForgetLinkTest");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//PageFacc.info("Initializing Login Factory Class")tory Official Way Of Attaching Driver to page classes
		tc.info("Initializing LoginFactory class");
		LoginFactory lf = PageFactory.initElements(driver, LoginFactory.class);
		tc.info("Click on Forget");
		lf.clickForget();
		tc.info("Verifying");
		try
		{
			Assert.assertTrue(driver.getCurrentUrl().contains("requestPasswordResetCode"));
			tc.pass("Cancel Button Checked & Its Pass");
		}
		catch(AssertionError e)
		{
			tc.fail("Cancel Button test gets Failed"+e.getMessage());
			Assert.fail(e.getMessage());
		}
		
		ex.flush();
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

