package com.lti.streamfiltershandson;

import java.text.DecimalFormat;
public class Employee {
  private String name;
  private Integer age;
  private Double salary;
 
  public Employee(String name, Integer age, Double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
 
  //Getters and Setters of name, age & salary go here
 
  public String toString()
  {
    DecimalFormat dformat = new DecimalFormat(".##");
    return "Employee Name:"+this.name
        + "  Age:"+this.age
        + "  Salary:"+dformat.format(this.salary);
  }

}
