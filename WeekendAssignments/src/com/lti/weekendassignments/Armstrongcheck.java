package com.lti.weekendassignments;
import java.util.Random;
import java.util.Scanner;
public class Armstrongcheck
{
	Random r=new Random();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the minimum range:");
	int min = s.nextInt();
	System.out.println("Enter the maximum range:");
	int max=s.nextInt();
	int val = r.nextInt(max - min) + min;
	System.out.println(val);
	int x,rem,res=0;
	while(val!=0)
	{
		rem=x%10;
		res+Math.pow(rem,3);
		val/=10;
	}
	if(res==val)
	{
		System.out.println(val+"is an Armstrong number.");
        else
            System.out.println(val+"is not an Armstrong number.");
	}
}
