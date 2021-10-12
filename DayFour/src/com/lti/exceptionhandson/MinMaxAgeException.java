package com.lti.exceptionhandson;

public class MinMaxAgeException extends Exception
{

	public MinMaxAgeException(int age)
	{
		System.out.println("Age should not be less than 18 or greater than 22 " +age);
	}

}
