package FacebookLaunch;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;  

public class Firefox 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
	    capabilities.setCapability("marionette",true);  
	    WebDriver driver= new FirefoxDriver(capabilities);  
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).sendKeys("Sarthak123@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("XYZ");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"u_0_h_hb\"]")).click();
	    Thread.sleep(7000);
	    
	}

}
