package com.lti.handson;

import java.util.Scanner;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		int i,j,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of lines:");
		 n=s.nextInt();
		for(i=1;i<n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.println(i);
			}
			System.out.println("");
		}
	}
}
