package com.lti.basics;

import java.util.Scanner;

public class TwoDimenDemo {
public static void main(String[] args)
{
	int[][] a = new int[3][3];
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the values");
	for(int i=0;i<3;i++)
	{
		for(int j=0; j<3;j++)
		{
			a[i][j]= s.nextInt();
		}
	}
	System.out.println("the values");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.println(a[i][j]+"\t");
			
		}
		System.out.println();
	}
}
}
