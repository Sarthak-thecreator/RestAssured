package com.window;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandling
{
WebDriver driver = null ;
public void readproperty() throws Exception {
FileInputStream fis = new FileInputStream("Resources\\config.properties");
Properties prop = new Properties();
prop.load(fis);
String browser = prop.getProperty("browser");
String URL = prop.getProperty("URL");
fis.close();
setup(browser,URL);
}
public void setup(String browser, String URL)
{
switch(browser){
case "firefox":
System.setProperty("webdriver.gecko.driver", "Resources\\geckodriver.exe");
driver = new FirefoxDriver();
break;
case "chrome":
System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
driver = new ChromeDriver();
break;
case "Edge": System.setProperty("webdriver.edge.driver", "Resources\\msedgedriver.exe");
driver = new EdgeDriver();
break;
}
driver.get(URL);
titletest();
}
public void titletest()
{
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	driver.findElement(By.name("q")).sendKeys("mobile");

	driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\'container\']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();



}
//*[@id="container"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button
public void teardown()
{
driver.close();
}
public static void main(String[] args) throws Exception
{
WindowHandling gsp = new WindowHandling();
gsp.readproperty();
}
}

