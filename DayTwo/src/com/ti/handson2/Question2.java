package com.ti.handson2;

public class Question2
{
	public static void main(String[] args) 
		{
			Calculator c=new Calculator();
			c.sum(5, 5);
			c.sum(5.1, 5.3);
			c.sum(5, 5.1);
			c.sum(5.1, 5);
			c.substract(6, 3);
			c.substract(3.2, 2.1);
			c.substract(3.2, 2);
			c.substract(4, 3.2);
			c.multiply(5, 4);;
			c.multiply(5.2,3.1);
			c.multiply(5, 3.1);
			c.multiply(2, 4.9);
			c.divison(3,2);
			c.divison(2.1,2.1);
			c.divison(2.2,2);
			c.divison(2,1.2);
		}
}
class Calculator
{
		void sum(int x,int y)
		{
			int sum=x+y;
			System.out.println("Sum:"+sum);
		}
		void sum(double x,double y)
		{
			double sum=x+y;
			System.out.println("Sum:"+sum);
		}
		void sum(int x,double y)
		{
			double sum=x+y;
			System.out.println("Sum:"+sum);
		}
		void sum(double x,int y)
		{
			double sum=x+y;
			System.out.println("Sum:"+sum);
		}
		void substract(int x,int y)
		{
			int diff=x-y;
			System.out.println("Difference:"+diff);
		}
		void substract(double x,double y)
		{
			double diff=x-y;
			System.out.println("Difference:"+diff);
		}
		void substract(double x,int y)
		{
			double diff=x-y;
			System.out.println("Difference:"+diff);
		}
		void substract(int x,double y)
		{
			double diff=x-y;
			System.out.println("Difference:"+diff);
		}
		void multiply(int x,int y)
		{
			int mul=x*y;
			System.out.println("Product:"+mul);
		}
		void multiply(double x,double y)
		{
			double mul=x*y;
			System.out.println("Product:"+mul);
		}
		void multiply(double x,int y)
		{
			double mul=x*y;
			System.out.println("Product:"+mul);
		}
		void multiply(int x,double y)
		{
			double mul=x*y;
			System.out.println("Product:"+mul);
		}
		void divison(int x,int y)
		{
			double div=x/y;
			System.out.println("Quotient:"+div);
		}
		void divison(double x,double y)
		{
			double div=x/y;
			System.out.println("Quotient:"+div);
		}
		void divison(double x,int y)
		{
			double div=x/y;
			System.out.println("Quotient:"+div);
		}
		void divison(int x,double y)
		{
			double div=x/y;
			System.out.println("Quotient:"+div);
		}
		
}

