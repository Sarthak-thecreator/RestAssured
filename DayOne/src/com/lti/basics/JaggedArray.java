package com.lti.basics;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] a = new int [3] [];
		a[0] = new int[1];
		a[1] = new int [3];
		a[2] = new int[2]; Scanner s = new Scanner(System.in);
		System.out.println("Enter the values");
		for(int i=0;i<3; i++) {//row
			for (int j=0; j<a[i].length;j++) { //column
				a[i][j] = s.nextInt();
			}
		}
		//logics
		System.out.println(" the values"); 
		for (int i=0;i<3; i++) 
		{			//row 
			for(int j=0; j<a[i].length; j++) 
			{//column
				System.out.print(a[i][j]+"\t");
			} 
		System.out.println();
		} 
		s.close();
	}
	}
