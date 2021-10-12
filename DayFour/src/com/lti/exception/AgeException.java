package com.lti.exception;

public class AgeException extends Exception 
{
	public AgeException(int age)
	{
		System.out.println("Age should be greater than 1 or less than 100 " +age);
	}
}
