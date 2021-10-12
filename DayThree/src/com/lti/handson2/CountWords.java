package com.lti.handson2;

import java.util.Scanner;
public class CountWords
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		System.out.println("There are" + count(s)+ "words in the string.");

	}
	static int count(String s)
	{
			int count=0;
			char c[]=new char[s.length()];
			for(int i=0;i<s.length();i++)
			{
				c[i]=s.charAt(i);
				 if( ((i>0)&&(c[i]!=' ')&&(c[i-1]==' ')) || ((c[0]!=' ')&&(i==0))) 
				 {
					 count++;
				 }
			}
			return count;
	}
}