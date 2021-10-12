package com.lti.ClassAndObject;

public class ConstDEMO 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank("Animesh",22);
		b.display();
	}
}
class Bank
{
	String name;
	int age;
	Bank(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name" +name);
		System.out.println("Age" +age);
	}
	void display()
	{
		System.out.println("Name" +name);
		System.out.println("Age" +age);
	}
}
