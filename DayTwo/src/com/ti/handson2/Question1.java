package com.ti.handson2;

public class Question1
{
	public static void main(String[] args) 
	{
		Shape s1=new Shape();
		s1.Area(6);
		s1.Area(2,3);
		s1.Perimeter(2);
		s1.Perimeter(2, 3);
	}
}
class Shape
{
	void Area(float x)
	{
		System.out.println("Area of square is:"+(x*x));
	}
	void Area(float x,int y)	
	{
		System.out.println("Area of the reactangle is:"+(x*y));
	}
	void Perimeter(float x)
	{
		System.out.println("Perimeter of square is:"+(4*x));
	}
	void Perimeter(float x,int y)
	{
		System.out.println("Area ofthe rectangele:"+2*(x+y));
	}
}	