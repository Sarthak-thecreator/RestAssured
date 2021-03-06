package codility;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrangeHRMLogin extends WebDriverTestCase
{
@Test
public void test1()throws Exception {
	webDriver.get("https://opensource-demo.orangehrmlive.com/");	
	webDriver.findElement(By.id("btnLogin")).click();
	Thread.sleep(2000);
	String errormsg =  webDriver.findElement(By.id("spanMessage")).getText();
	assertEquals("Username cannot be empty",errormsg);
}
@Test
public void test2()throws Exception {
	webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	webDriver.findElement(By.id("btnLogin")).click();
	Thread.sleep(2000);
	String errormsg2 =  webDriver.findElement(By.id("spanMessage")).getText();
	assertEquals("Password cannot be empty", errormsg2);
}
@Test
public void test3()throws Exception {
	webDriver.findElement(By.id("txtUsername")).sendKeys("Admin");
	webDriver.findElement(By.id("txtPassword")).sendKeys("admin");
	webDriver.findElement(By.id("btnLogin")).click();
	Thread.sleep(2000);
	String errormsg3 =  webDriver.findElement(By.id("spanMessage")).getText();
	assertEquals("Invalid credentials", errormsg3);
	
	
}
	
}
