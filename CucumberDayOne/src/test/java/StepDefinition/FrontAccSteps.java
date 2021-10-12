package StepDefinition;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrontAccSteps {
	WebDriver driver;
	@Before
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@After
	public void After()
	{
		driver.quit();
	}

	@Given("user is on Login Page")
	public void user_is_on_login_page() {

		driver.get("http://demo.frontaccounting.eu/");
	}

	@When("user enters username as {string} & Password as {string} & and Click on Login Button")
	public void user_enters_user_name_as_password_as_and_click_on_login_button(String un, String pwd) {

		driver.findElement(By.name("user_name_entry_field")).clear();
		driver.findElement(By.name("user_name_entry_field")).sendKeys(un);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("SubmitUser")).click();

	}

	@Then("login {string}  happen")
	public void login_happen(String status) {
		if (status.equals("should")) {
			if (driver.getTitle().equals("Main Menu")) {
				System.out.println("Positive Test For Login get Pass");
			} else {
				System.out.println("Positive Test For Login get Fail");
				Assert.fail("Positive Test For Login get Fail");

			}
		} else {
			if (driver.getTitle().equals("Main Menu")) {
				System.out.println("Negative Test Failed");
				Assert.fail("Negative Test Failed");
			} else {
				System.out.println("Negative Test Pass");

			}

		}
		
	}

}
