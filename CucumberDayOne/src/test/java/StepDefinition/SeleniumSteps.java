package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SeleniumSteps {
	WebDriver driver;
	
	@Given("User is on Home Page of Selenium")
	public void user_is_on_home_page_of_selenium() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://selenium.dev");
	}

	@When("User Clicks on Download Link")
	public void user_clicks_on_download_link() {
		driver.findElement(By.linkText("Downloads")).click();
		
	}
	@Then("title should be (string)")
	public void title_should_be(String string) {
		Assert.assertEquals("Download | Selenium", driver.getTitle());
		driver.quit();
	}
}
