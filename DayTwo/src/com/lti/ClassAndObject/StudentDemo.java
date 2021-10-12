package com.lti.ClassAndObject;

import java.util.Scanner;

public class StudentDemo 
{

	public static void main(String[] args) 
	{
		Student[] s= new Student[3];
		for(int i=0;i<3;i++)
		{
			s[i]=new Student();
			s[i].getdata();
			s[i].showdata();
			info f=new info();
			f.showdata(s[i]);
		}

	}

}
class info
{
	void showdata(Student stu)
	{
		System.out.println("Id"+stu.getId());
		System.out.println("Name"+stu.getName());
		System.out.println("DOB"+stu.getDOB());
		System.out.println("College Name"+Student.collegeName);
	}
}
class Student
{
	int id;
	String name;
	String DOB;
	static String collegeName="Loyala";
	public int getId() 
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getDOB() 
	{
		return DOB;
	}
	public void setDOB(String dOB) 
	{
		DOB = dOB;
	}
	
	
	
	void getdata()
	{
		Student s1=new Student();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id:");
		id=s.nextInt();
		s1.setId(id);
		System.out.println("Enter the name:");
		name=s.next();
		s1.setName(name);
		System.out.println("Enter the date of birth:");
		DOB=s.next();
		s1.setDOB(DOB);
	}
	void showdata()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("DOB:"+DOB);
	}
}