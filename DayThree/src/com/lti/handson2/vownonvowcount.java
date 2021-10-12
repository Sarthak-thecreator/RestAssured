package com.lti.handson2;

import java.util.Scanner;

public class vownonvowcount 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		for (int i=0 ; i<str.length(); i++){
			char ch = str.charAt(i);
			System.out.println(ch);
	        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
	           count=count+1;
	        }
	     }
		System.out.println("Number of vowels count is "+count);
		System.out.println("Number of non-vowels count is "+(str.length()-count));
		 

		
		
		
		

	}

}