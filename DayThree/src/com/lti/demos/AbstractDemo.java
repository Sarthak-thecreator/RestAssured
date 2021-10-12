package com.lti.demos;

public class AbstractDemo {

	public static void main(String[] args)
	{
		Flat1 f1= new Flat1();
		f1.kitchen();
		f1.bedroom();
		f1.bathroom();
		f1.hall();
		f1.amenities();
		System.out.println("Flat1");
		Flat2 f2= new Flat2();
		f2.kitchen();
		f2.bedroom();
		f2.bathroom();
		f2.hall();
		f2.amenities();
	}

}
abstract class 	Apartment
{
	abstract void kitchen();
	abstract void bedroom();
	abstract void bathroom();
	abstract void hall();
	void amenities()
	{
		System.out.println("park");
		System.out.println("Gym");
	}
}
class Flat1 extends Apartment
{
	void kitchen()
	{
		System.out.println("6*4");
	}
	void bedroom()
	{
		System.out.println("10*8");
	}
	void bathroom()
	{
		System.out.println("5*3");
	}
	void hall()
	{
		System.out.println("14*12");
	}
	void balcony()
	{
		System.out.println("6*10");
	}
}
class Flat2 extends Apartment
{
	void kitchen()
	{
		System.out.println("8*5");
	}
	void bedroom()
	{
		System.out.println("11*10");
	}
	void bathroom()
	{
		System.out.println("8*6");
	}
	void hall()
	{
		System.out.println("16*14");
	}
}