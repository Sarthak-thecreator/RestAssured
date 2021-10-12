package com.lti.handson1;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
	    System.out.println("Enter the radius:");
	    int rad= s.nextInt();
		Circle c1;
		CircleCal c2=new CircleCal();
		c1=c2;
		c1.circumference(rad);
		c1.area(rad);
	}

}
interface Circle
{
	static final double pi=3.14;
	void circumference(int r);
	void area(int r);
}
class CircleCal implements Circle
{
	public void circumference(int r) 
	{
		double C=2*pi*r;
		System.out.println("Circumference:"+C);
	}
	public void area(int r)
	{
		double A=pi*(r*r);
		System.out.println("Area:"+A);
	}
}