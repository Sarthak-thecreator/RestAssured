package com.lti.ClassAndObject;

public class MethodOverriding
{

	public static void main(String[] args) 
	{
		Child c= new Child();
		c.show();
	}

}
class Parent
{
	int a;
	int b;
	public Parent	(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Super class constructor.");
	}
	void show()
	{
		System.out.println("Super Class method.");
	}
}
class Child extends Parent
{
	Child()
	{
		super(5,6);
		System.out.println("Sub class Constructor.");
	}
	void show()
	{
		super.show();
		System.out.println("Sub class method.");
	}
}