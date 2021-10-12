package com.lti.exceptionhandson;

public class MaritalException extends Exception
{
	public MaritalException(int a)
	{
		System.out.println("Not a valid marital status");
	}
}
