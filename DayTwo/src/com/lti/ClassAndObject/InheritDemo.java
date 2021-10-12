package com.lti.ClassAndObject;

import java.util.Scanner;
public class InheritDemo
{
	public static void main(String[] args) 
	{
		Display d=new Display();
		d.getData();
		d.calc();
		d.show();
	}
}
class Emp
{
		int bp,hra,ta;
		void getData()
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the basic pay:");
			bp=s.nextInt();
			System.out.println("Enter the House Rent Allowance:");
			hra=s.nextInt();
			System.out.println("Enter the Travel Allowance:");
			ta=s.nextInt();	
		}
}
class NetSalary extends Emp
{
	int ns;
	void calc()
	{
		ns=bp+hra+ta;
	}
}
class Display extends Emp
{
	
}