package com.lti.exception;

import java.io.DataInputStream;

import java.io.IOException;
public class TryCatchDemo {

	public static void main(String[] args)
	{
		DataInputStream din= new DataInputStream(System.in);
		try
		{
				System.out.println("Enter the value of a:");
				int a=Integer.parseInt(din.readLine());
				System.out.println("Enter the value of b:");
				int b=Integer.parseInt(din.readLine());
				int c=a/b;
				System.out.println("The result is:"+c);
		}
		catch(NumberFormatException ne)
		{
			ne.printStackTrace();
		}
		catch(ArithmeticException ae)	
		{
			ae.printStackTrace();
		}
		
		catch(IOException ie)	
		{
			ie.printStackTrace();
		}
		
		catch(Exception e) {
//		System.out.println("Error");	
//		System.out.println(e);
		e.printStackTrace();
		}
		
		
	}

}
