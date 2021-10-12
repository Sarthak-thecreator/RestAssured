package com.lti.exceptionhandson;

import java.io.IOException;
import java.util.Scanner;

public class VotingEligibility 
{

	public static void main(String[] args) throws IOException,NumberFormatException,Exception
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
		if(age<=18)
		{
			throw new VoteException(age);
		}
		else
		{
			System.out.println("You are eligible to vote");
		}
	}

}
