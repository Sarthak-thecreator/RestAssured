package com.lti.demos;

public class staticExample {

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		A a=new A();
		a.display();
		A.show();
		check();
		check2();
	}
	static void check()
	{
		System.out.println("Staic method in Main class.");
	}
	static 
	{
		System.out.println("Static Block");
	}
	static void check2()
	{
		System.out.println("Static method 2 in Main class");
	}
	

}
class A
{
	A()
	{
		System.out.println("Constructor");
	}
	void display()
	{
		System.out.println("non static method in class A");
	}
	static void show()
	{
		System.out.println("Static method in class A");
	}
	{
		System.out.println("Anonymous Block");
	}
}