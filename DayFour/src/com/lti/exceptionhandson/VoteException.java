package com.lti.exceptionhandson;

public class VoteException extends Exception
{
	public VoteException(int age)
	{
		System.out.println("You are too young to vote " +age);
	}
}
