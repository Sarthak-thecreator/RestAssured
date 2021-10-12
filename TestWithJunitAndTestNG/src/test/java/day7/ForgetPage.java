package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPage
{
	WebDriver driver;
	ForgetPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By e_un=By.name("securityAuthentication[userName]");
	By e_reset=By.id("btnSearchValues");
	By e_cancel=By.id("btnCancel");
	public void doReset(String user)
	{
		driver.findElement(e_un).sendKeys(user);
		driver.findElement(e_reset).click();
	}
	public void doCancel()
	{
		driver.findElement(e_cancel).click();
	}
}
