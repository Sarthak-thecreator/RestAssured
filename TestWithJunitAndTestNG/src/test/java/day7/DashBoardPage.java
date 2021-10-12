package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage 
{
	WebDriver driver;
	DashBoardPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By e_welcome =By.id("welcome");
	By e_logOut=By.linkText("Logout");
	public void doLogout()
	{
		driver.findElement(e_welcome).click();
		driver.findElement(e_logOut).click();
	}
}
