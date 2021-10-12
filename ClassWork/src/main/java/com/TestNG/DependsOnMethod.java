package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod
{
	@Test
	  public void TestCase1() 
	  {
		  System.out.println("TestCase1");
	  }
	  @Test(dependsOnMethods="TestCase1")
	  public void TestCase2() 
	  {
		  System.out.println("TestCase2");
		  Assert.assertEquals("xyz", "abc");
	  }
	  @Test(dependsOnMethods="TestCase2",alwaysRun=true)
	  public void TestCase3() 
	  {
		  System.out.println("TestCase3");
	  }
}
