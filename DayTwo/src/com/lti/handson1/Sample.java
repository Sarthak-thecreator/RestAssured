package com.lti.handson1;

class Sample1 
{
	public String name;
	public int age;
	public static int count=0;
	Sample1(String name,int age)
	{
		this.name=name;
		this.age=age;
		count++;
	}
	
	

}
public class Sample
{
	public static void main(String[] args)
	{
		Sample1 s1= new Sample1("Abhishek",21);
		Sample1 s2= new Sample1("Sarthak",21);
		Sample1 s3=new Sample1("Tony",20);
		Sample1 s4= new Sample1("Sam",23);	
		System.out.println("Objects are instantiated" + Sample1.count + "times in this class.");
	}
	
}
