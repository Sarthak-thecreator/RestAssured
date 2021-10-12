package com.lti.handson;

import java.util.Scanner;

public class SumHarmonicSeries 
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of number of terms:");
		int n=s.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
		sum=sum+(double)1/i;
		}
		System.out.println("\n The sum of the series is:"+sum);
	}
}
	
