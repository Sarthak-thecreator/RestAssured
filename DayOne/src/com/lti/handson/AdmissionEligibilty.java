package com.lti.handson;

import java.util.Scanner;
public class AdmissionEligibilty 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the marks in Maths:");
		int m=s.nextInt();
		System.out.println("Enter the marks in Physics:");
		int p=s.nextInt();
		System.out.println("Enter the marks in Chemistry:");
		int c=s.nextInt();
		boolean elig=IsElig(m,p,c);
		if(elig)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
	public static boolean IsElig(int m,int p, int c)
	{
		if(m<60)
		{
			return false;
		}
		if(p<50)
		{
			return false;
		}
		if(c<40)
		{
			return false;
		}
		else if ((m + p + c) < 200)
		{
            return false;
        }
		else if ((m + p) < 150) 
		{
            return false;
        }
		else 
		{
            return true;
        }
	}
}
