package com.lti.handson2;

import java.util.Scanner;
public class StringReplace {

	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the string:");
			String s=sc.next();
			String r=s.replace('a','e');
			System.out.println("ReplacedString:"+	r);
	}

}
