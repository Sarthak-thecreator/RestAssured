package com.lti.basics;

import java.util.Scanner;

	public class UserInputDemo {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = s.nextInt();
		System.out.println("Enter the value of b:");
		int b = s.nextInt();
		int c=a+b;
		System.out.println("The result is :"+c);
}
