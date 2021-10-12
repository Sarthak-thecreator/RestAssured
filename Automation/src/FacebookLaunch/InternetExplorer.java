package FacebookLaunch;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver; 
public class InternetExplorer
{

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();  
		driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("Sarthak123@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("XYZ123");
        Thread.sleep(5000);
        driver.findElement(By.id("u_0_2")).click(); 
        Thread.sleep(7000);
	}

}
