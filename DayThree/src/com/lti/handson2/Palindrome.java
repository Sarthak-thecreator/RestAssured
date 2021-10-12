package com.lti.handson2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		String x="";
		for(int i=s.length()-1;i>=0;i--)
		{
			x=x+s.charAt(i);
		}
		if(s.equals(x))
		{
			System.out.println(s+ "is a Palindrome");
		}
		else
		{
			System.out.println(s+ "is not a Palindrome");
		}
	}

}
