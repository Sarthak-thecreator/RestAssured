package com.lti.demos;

public class InterfaceDemo {

	public static void main(String [] args) 
	{
		//inter1 i;
//		Arithimetic1 a1 = new Arithimetic1(); //Object
//		i1 = a1;
//		i1.add(59,60);
//		i1.sub(80,70);
//		
//		Arithimetic1 a2 = new Arithimetic1(); //Object
//		a2.add(50,60);
//		a2.sub(86, 70);
//		
//		inter2 i2; //reference
//		Calc c1 = new Calc(); //Object
//		i2 = c1;
//		i2.add(59,60);
//		i2.sub(80,70);
		inter3 i3;
		Check c=new Check();
		i3 = c;
		i3.add(50,60);
		i3.sub(60,50);
		i3.mul(50,6);
		i3.div(20,9);
		i3.show();
		Last l;
		Check d = new Check();

		l=d;
		l.display();
	}

}
interface inter1
{
	static final int j=10;
	void add(int a,int b);
	void sub(int a ,int b);
}
interface inter2 extends inter1
{
	int j=20;
	void mul(int a,int b);
	void div(int a, int b);
}
interface inter3 extends 	inter2,inter1
{
	void show();
}
interface Last
{
	void display();
	
}
class Arithmetic1 implements inter1
{
	public void add(int a,int b)
	{
		int c=a+b+j;
		System.out.println("Result:"+c);
	}
	public void sub(int a ,int b)
	{
		int c=a-b;
		System.out.println("Result:"+c);
	}
}
class Calc extends Arithmetic1 implements inter2
{
	public void mul(int a,int b)
	{
		int c=a*b;
		System.out.println("Result:"+c);
	}
	public void div(int a ,int b)
	{
		int c=a/b;
		System.out.println("Result:"+c);
	}
}
class Check extends Calc implements inter3,Last
{
	public void show()
	{
		System.out.println("End");
	}
	public void display()
	{
		 System.out.println("End of the program");
		}
}