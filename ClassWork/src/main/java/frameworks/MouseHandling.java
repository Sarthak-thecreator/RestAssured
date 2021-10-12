package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHandling
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		WebElement Admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]"));
		WebElement Jobs = driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"));
		WebElement JobCategories = driver.findElement(By.xpath("//*[@id=\"menu_admin_jobCategory\"]"));
		Actions action= new Actions(driver);
		action.moveToElement(Admin).perform();
		action.moveToElement(Jobs).perform();
		action.moveToElement(JobCategories).click().build().perform();
	}
}
