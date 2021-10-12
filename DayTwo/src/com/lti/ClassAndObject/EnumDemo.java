package com.lti.ClassAndObject;

import java.net.Proxy.Type;
import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in)
		System.out.println("Enter Professional or academic");;
		String str= s.next();
		DimplomaCourse dc= new DiplomaCourse(Type.valueOf(str));
		dc.getData();
		dc.display();
		dc.CalculateMonthlyFees();
	}

}
class Course
{
	int id;
	String name;
	int duration;
	double fees;
	void getData()
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("Name");
		name=s.next();
		System.out.println("ID");
		id=s.nextInt();
		System.out.println("Duration");
		duration=s.nextInt();
		System.out.println("Fees");
		fees=s.nextDouble();
	}
	void CalculateMonthlyFees()
	{
		System.out.println("Fees Details");
	}
}
class DegreeCourse extends Course
{
	enum level{Bachelors,Masters};
	boolean isPlacementAvailable;
	void check()
	{
		level l= level.Bachelors;
		System.out.println(l);
	}
	void showData()
	{
		System.out.println("Name"+name);
	}
	void CalculateMonthlyFees()
	{
		super.CalculateMothlyFees();
		Scanner s-new Scanner(System.in);
		System.out.println("Is Placement Available");
		isPLacementAvailale=s.nextBoolean();
		if(isPlacementAvailable==true)
		{
			fees=fees+(fees*0.1);
			System.out.println("Fees" +fees);
		}
		else
		{
			System.out.println("Fees"+fees);
		}
	}
}
class DiplomaCourse extends Course
{
	enum type{Professional,Academic};
	type t;
	public DiplomaCourse(type t)
	{
		this.t=t;
	}
	void display() {
		System.out.println("Name"+name);
	}
	void CalculateMonthlyFees()
	{
		super.CalculateMonthlyFees();
	}
	switch(t)
	{
	case Professional;
	fees=fees+(fees*0.1);
	System.out.println("Fees"+fees);
	break;
	}
	case Academic;
	fees=fees+(fees*0.05);
	System.out.println("Fees:"+fees);
	break;
}
}
}