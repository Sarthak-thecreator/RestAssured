package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestCase {
  @Test
  public void TestCase1() 
  {
	  System.out.println("TestCase1");
  }
  @Test
  public void TestCase2() 
  {
	  System.out.println("TestCase2");
  }
  @Test
  public void TestCase3() 
  {
	  System.out.println("TestCase3");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("BeforeMethod: launch browser");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After Method: close browser");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("BeforeClass: setupTestData");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After Class: clearTestData");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before Test: OpenDB connection");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test: closeDB connection");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("Before Suit: Smoke Testing");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("After Suite: Generate Reports");
  }

}
