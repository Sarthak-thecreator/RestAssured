package com.lti.handson1;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) 
	{
		
	}

}
abstract class Employee
{
	abstract void Salary();
	abstract void Loan();
	abstract void Allowance();
	Scanner s=new Scanner(System.in);
}
class Manager extends Employee
{
	int sal;
	void Salary()
	{
		System.out.println("Enter the Manger Salary: ");
		sal=s.nextInt();
	}
	void Loan()
	{
		double	Loan = sal*0.4;
		System.out.println("Loan allotted is:"+Loan);
	}
	void allowance()
	{
		
	}
}
class Designer extends Employee
{
	
}