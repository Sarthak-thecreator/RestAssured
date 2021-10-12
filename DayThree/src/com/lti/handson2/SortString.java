package com.lti.handson2;

import java.util.Scanner;
import java.io.*;
public class SortString {

	public static void main(String[] args) 
	{
		int n=5;
		String names[]= {"John","Jonathan","Sam","Tom","Andrew"};
		String temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
	}
}