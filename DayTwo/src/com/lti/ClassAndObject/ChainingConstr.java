package com.lti.ClassAndObject;

public class ChainingConstr 
{
	public static void main(String[] args) 
	{
		A a = new A("Sarthak123");
	}
}
class A
{
	A()
	{
		System.out.println("Default Costructor");
	}
	A(String name)
	{
		this("Peter",23);
		System.out.println("Name"+name);
	}
	A(String name, int age)
	{
		this();
		System.out.println("Name" +name);
		System.out.println("Age" +age);
	}
}