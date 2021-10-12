package com.lti.handson1;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Radha");
		Employee e2=new Employee("Radha",1234);
		Employee e3=new Employee("Radha",1234,45);
		Employee e4=new Employee("Radha",1234,"Manager");
		Employee e5=new Employee("Radha",1234,45,"Manager");
		Employee e6=new Employee("Radha",1234,"Mumbai",45);
		Employee e7=new Employee("Radha",1234,45,15);
		Employee e8=new Employee("Radha","Manager",1234,15);
		Employee e9=new Employee("Radha",1234,"Manager","Mumbai",15);
		Employee e10=new Employee("Radha",1234,45,"Manager","Mumbai",15);

	}

}

class Employee{
	String empName,empDesig,empLocation;
	int empId,empAge,empExpInYrs;
	//1
	Employee(String empName){
		System.out.println("Employee Name : "+empName);
		System.out.println();
	}
	//2
	Employee(String empName,int empId){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println();
	}
	//3
	Employee(String empName,int empId,int empAge){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Age : "+empAge);
		System.out.println();
	}
	//4
	Employee(String empName,int empId,String empDesig){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Designation : "+empDesig);
		System.out.println();
	}
	//5
	Employee(String empName,int empId,int empAge,String empDesig){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Age : "+empAge);
		System.out.println("Employee Designation : "+empDesig);
		System.out.println();
	}
	//6
	Employee(String empName,int empId,String empLocation,int empAge){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Age : "+empAge);
		System.out.println("Employee Location : "+empLocation);
		System.out.println();
	}
	//7
	Employee(String empName,int empId,int empAge,int empExpInYrs){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Age : "+empAge);
		System.out.println("Employee Experience in years : "+empExpInYrs);
		System.out.println();
	}
	//8
	Employee(String empName,String empDesig,int empId,int empExpInYrs){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Designation : "+empDesig);
		System.out.println("Employee Experience in years : "+empExpInYrs);
		System.out.println();
	}
	//9
	Employee(String empName,int empId,String empDesig,String empLocation,int empExpInYrs){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Designation : "+empDesig);
		System.out.println("Employee Location : "+empLocation);
		System.out.println("Employee Experience in years : "+empExpInYrs);
		System.out.println();
	}
	//10
	Employee(String empName,int empId,int empAge,String empDesig,String empLocation,int empExpInYrs){
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Age : "+empAge);
		System.out.println("Employee Designation : "+empDesig);
		System.out.println("Employee Location : "+empLocation);
		System.out.println("Employee Experience in years : "+empExpInYrs);
		System.out.println();
	}
	
}