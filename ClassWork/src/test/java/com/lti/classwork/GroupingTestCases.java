package com.lti.classwork;

import org.testng.annotations.Test;

public class GroupingTestCases 
{
	@Test(groups= {"Smoke Testing","Regression Testing"})
	  public void TestCase1() 
	  {
		  System.out.println("TestCase1");
	  }
	  @Test(groups= {"Smoke Testing","Regression Testing"})
	  public void TestCase2() 
	  {
		  System.out.println("TestCase2");
	  }
	  @Test(groups= {"Functional Testing","Sanity Testing"})
	  public void TestCase3() 
	  {
		  System.out.println("TestCase3");
	  }

}
