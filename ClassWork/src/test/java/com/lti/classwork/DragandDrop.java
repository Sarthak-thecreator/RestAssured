	package com.lti.classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	  	WebDriver driver = new ChromeDriver();
	  	driver.get("https://jqueryui.com/droppable/");
	  	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	  	
	  	WebElement Drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	  	WebElement Drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	  	
	  	Actions action = new Actions(driver);
	  	action.dragAndDrop(Drag, Drop).build().perform();
	}
	}

