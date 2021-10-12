package com.google;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class Rediff {
		
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
		
		
		public void setup(String browser, String URL) throws InterruptedException 
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
				
			case "Edge":

				System.setProperty("webdriver.edge.driver", "Resources\\msedgedriver.exe");
				driver = new EdgeDriver();
				break;
			}	
			driver.get(URL);
			rediffmailLinkTest();
		}
		
	public void rediffmailLinkTest() throws InterruptedException 
		{
			driver.findElement(By.linkText("Rediffmail")).click();
			String navURL = driver.getCurrentUrl();
			if (navURL.equals("https://mail.rediff.com/cgi-bin/login.cgi"))
				System.out.println("Pass");
			else 
				System.out.println("Fail");
		//	loginTest();
			orderOfCursor();
		}
	
/*	public void loginTest() throws InterruptedException 
	{
		
		driver.findElement(By.id("login1")).sendKeys("trainer23");
		driver.findElement(By.id("password")).sendKeys("trainer23");
		driver.findElement(By.id("remember")).sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();

		
		if (driver.findElement(By.id("login1")).getAttribute("value").isEmpty())
			System.out.println("Pass");
		else 
			System.out.println("Fail");
		

		if (driver.findElement(By.id("remember")).isSelected())
			System.out.println("Pass");
		else 
			System.out.println("Fail");
	} */
				
	public void orderOfCursor()
	{
		if (driver.findElement(By.id("login1")).getAttribute("tabindex").equals("1"))
			System.out.println("Login 1st focus");
		if (driver.findElement(By.id("password")).getAttribute("tabindex").equals("2"))
			System.out.println("Password 2nd focus");
		if (driver.findElement(By.id("remember")).getAttribute("tabindex").equals("3"))
			System.out.println("Remember 3nd focus");
		if (driver.findElement(By.name("proceed")).getAttribute("tabindex").equals("4"))
			System.out.println(" Signin 4th focus");
		createNewAccountTest();
	}
	
	public void createNewAccountTest() 
	{
		driver.findElement(By.linkText("Create a new account")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click();
		
		
		List<WebElement> gender = driver.findElements(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[24]/td[3]"));
		System.out.println(gender);
		for (WebElement g : gender)
		{
			if (g.isSelected())
				System.out.println("You have selected : " + g.getAttribute("m"));
		
		}
		
	}
	//	public void teardown()
	//	{
	//		
	//		driver.quit();
	//	}
		
	public static void main(String[] args) throws Exception 
		{
			
			Rediff red = new Rediff();
			red.readproperty();
		 }
	}