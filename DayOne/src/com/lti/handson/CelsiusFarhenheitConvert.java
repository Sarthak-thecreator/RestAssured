package com.lti.handson;

import java.util.Scanner;

public class CelsiusFarhenheitConvert {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	double c=0.0;
	System.out.println("Enter the temperature:");
	double f=s.nextDouble();
	c =  (f- 32)/1.8;
	System.out.println("Temperature in F\tTemperature in Celcius \n");
	System.out.println(f+"\t\t\t"+c);
}
}
