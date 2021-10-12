package com.lti.weekendassignments;
import java.util.Scanner;
import java.util.Random;
public class primecheck 
{
	public static void main(String[] args) 
	{
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the minimum range:");
		int minRange = s.nextInt();
		System.out.println("Enter the maximum range:");
		int maxRange=s.nextInt();
		boolean flag = false;
        int value = r.nextInt(maxRange - minRange) + minRange;
        System.out.println(value);
        for (int i = 2; i <= value / 2; ++i) {
          // condition for nonprime number
          if (value % i == 0) {
            flag = true;
            break;
          }
        }

        if (!flag)
          System.out.println(value + " is a prime number.");
        else
          System.out.println(value + " is not a prime number.");
	}
}
