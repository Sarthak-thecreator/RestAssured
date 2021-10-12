	package com.lti.handson;

import java.util.Scanner;

public class Square2DArray {
	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
		 int row_size,col_size;
		    //Get size of matrix
		    System.out.print("Enter the row Size Of the Matrix:");
		    row_size=cs.nextInt();
		    System.out.print("Enter the columns Size Of the Matrix:");
		    col_size=cs.nextInt();

		    int matrix[][] =new int[row_size][col_size];

		    //Taking input of the matrix
		    int i,j;
		    System.out.println("Enter the Matrix Element:");
		    for(i=0;i<row_size;i++)
		    {
		        for(j=0;j<col_size;j++)
		        {
		            matrix[i][j]=cs.nextInt();
		        }
		    }
		    
		    //compute square of the matrix
		     for(i=0;i<row_size;i++)
		    {
		        for(j=0;j<col_size;j++)
		        {
		            matrix[i][j]=(int) Math.pow(matrix[i][j],2);
		        }
		    }
		    
		     //display the square of the matrix
		    System.out.println("Square of the Matrix elements are:");
		    for(i=0;i<row_size;i++)
		    {
		        for(j=0;j<col_size;j++)
		        {
		        	System.out.print(matrix[i][j]+" ");
		        }
		        System.out.println();
		    }
		    cs.close();
	}
}
