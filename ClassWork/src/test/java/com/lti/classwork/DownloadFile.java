package com.lti.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


import io.github.bonigarcia.wdm.WebDriverManager;
public class DownloadFile
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://files.fm");
		driver.manage().window().maximize();



		WebElement w1 = driver.findElement(By.xpath("//*[@id=\"uploadifive-file_upload\"]/input[2]"));
		w1.sendKeys("E:\\ExcelLogin.xslx");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/section[1]/div/div/div[2]/div[4]/div[1]/div")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/section[1]/div/div/div[2]/div[3]/form/button")).click();
		Thread.sleep(5000);
		String copylink = driver.getCurrentUrl();



		System.out.println(copylink);



		driver.close();
		}



}
