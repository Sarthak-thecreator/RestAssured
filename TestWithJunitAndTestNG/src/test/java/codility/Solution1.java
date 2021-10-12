package codility;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Solution1 extends WebDriverTestCase {

	@Test
	public void test1()
	{
		webDriver.get("https://www.bing.com/");
		assertEquals("Bing",webDriver.getTitle());
	}
	/**
	 * 
	 */
	@Test
	public void test2()
	{
		webDriver.findElement(By.name("q")).sendKeys("codility");
		webDriver.findElement(By.name("q")).sendKeys("Keys.ENTER");
		List<WebElement> ls= webDriver.findElements(By.xpath("//ol[@id='b_results']/li"));
		System.out.println("Total search results are:"+ls.size());
		assertTrue(ls.size()>=1);
	}

}
