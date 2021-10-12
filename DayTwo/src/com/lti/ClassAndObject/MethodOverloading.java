package com.lti.ClassAndObject;

public class MethodOverloading
{
	public static void main(String[] args) 
	{
		Add a =new Add();
		a.sum(5,8.5f);
		a.sum(5, 8);;
		a.sum(21,23,23.9f);	
	}
}
class Add
{
	void sum(int a, int b)
	{
		int c=a+b;
		System.out.println("Two int paramters:"+c);
	}
	void sum(int a,float b)
	{
		float c=a+b;
		System.out.println("Int and Float paramters"+c);
	}
	void sum(int a,int b,float d)
	{
		float c=a+b+d;
		System.out.println("2 Int and 1 FLOAT parameters" +c);
	}
}
