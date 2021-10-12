package com.lti.exceptionhandson;
import java.io.IOException;
import java.util.Scanner;
public class CrewMember 
{

	public static void main(String[] args)throws IOException,ArithmeticException,NumberFormatException,Exception 
	{
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the age:");
				int age=s.nextInt();
				if(age<18||age>22)
				{
					throw new MinMaxAgeException(age);
				}
				else
				{
					System.out.println("You are a crewmember" +age);
				}
	}

}

