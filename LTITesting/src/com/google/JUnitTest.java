package com.google;

import static org.junit.Assert.assertEquals;
import org.junit.Assert.*;
import org.junit.Test;
public class JUnitTest 
{
	@Test
	public void test1()
	{
		String str1="Hi";
		assertEquals("Strings did not match","Hi", str1);
	}
	@Test
	public void test2()
	{
		String str1="Hi";
		assertEquals("Strings did not match","Hello", str1);
		assertEquals("Strings did not match","Hi", str1);
		assertEquals("Strings did not match","Hiiiiii", str1);
	}

}
