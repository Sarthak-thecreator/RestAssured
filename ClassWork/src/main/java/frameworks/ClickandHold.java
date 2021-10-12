package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickandHold {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	  	WebDriver driver = new ChromeDriver();
	  	driver.get("https://jqueryui.com/droppable/");
	  	driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[4]/a")).click();
	  	driver.switchTo().frame(driver.findElement(By.className("ui-selectable")));
	  	WebElement item1=  driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
	  	WebElement item2=  driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
	  	WebElement item3=  driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
	  	WebElement item4=  driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
	  	WebElement item5=  driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[5]"));
	  	WebElement item6=  driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[6]"));
	  	WebElement item7=  driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[7]"));
	  	Actions action= new Actions(driver);
	  	action.clickAndHold(item1).perform();
	  	action.clickAndHold(item4).release().build().perform();
	}

}
