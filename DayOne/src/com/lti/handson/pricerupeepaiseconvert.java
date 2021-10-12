package com.lti.handson;

import java.util.Scanner;
public class pricerupeepaiseconvert {
	public static void main(String[] args)
	  {
		int paise;
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter Price in Rupees(p):");
	    double p=scan.nextDouble();
	    paise=p*100;
	    System.out.println("Price in paise ="+paise);
	  }
	 
}
