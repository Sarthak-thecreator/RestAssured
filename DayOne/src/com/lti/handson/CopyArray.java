package com.lti.handson;

import java.util.Scanner;
public class CopyArray {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int a[]= new int[5];
	int b[]= new int[5];
			for(int i=0;i<5;i++)
			{
				a[i]=sc.nextInt();
				b[i]=a[i];
			}
		System.out.println("Elements of first array: ");    
		for (int i = 0; i <5; i++) 
		{     
			System.out.println(a[i] + " ");    
		}     
		System.out.println();    
		 System.out.println("Elements of new array: ");    
	        for (int i = 0; i < 5; i++) {     
	           System.out.print(b[i] + " ");    
	        }     
}
}
