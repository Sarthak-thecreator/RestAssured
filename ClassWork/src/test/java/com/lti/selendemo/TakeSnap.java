package com.lti.selendemo;

import java.io.*;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TakeSnap {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/");
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File Srcfile=screenshot.getScreenshotAs(OutputType.FILE);
        File Destfile= new File("C:\\Users\\personal\\workspace\\ClassWork\\src\\test\\resources\\Screenshots\\facebook.jpg");
        FileUtils.copyFile(Srcfile, Destfile);

	}

}
