package com.lti.weekendassignments;

import java.util.Scanner;

public class Arrayelemcheck 
{
	public static boolean check(int[]a,int item)
	{
		for(int n:a)
		{
			if(item==n)
			{
				return true;
			}
		}
		return false;
	}

	
		public static void main(String[] args) {
	          int[] m1= {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2265, 1457, 2456};
	      System.out.println(contains(m1,2013));
	      System.out.println(contains(m1, 2015));
	   }
	}
	}
}
