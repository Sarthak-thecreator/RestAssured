package com.lti.collectionhandson;
 import java.util.ArrayList;
 public class Operation 
 {


	public static void main(String[] args) {
		ArrayList<Object> arr =new ArrayList<Object>();
		
			Integer a1=new Integer(1);
			Integer a2=new Integer(2);
			Integer a6=new Integer(5);
			Integer a3=new Integer(3);
			Integer a4=new Integer(4);
			Integer a5=new Integer(5);
			Integer wrapperType = new Integer(90);
		    
			arr.add(a1); 
			arr.add(a2); 
			arr.add(a3);
			arr.add(a4);
			arr.add(a5);
			arr.add(a6);
			arr.add(wrapperType);
			
			String str="Sarthak";

			arr.add(str);

			System.out.println("ARRAY LIST IS: "+arr);
			
			arr.remove(2);

			System.out.println("ARRAY LIST AFTER REMOVING Element 2 IS: "+arr);
			
		 
			System.out.println("Index of 4 is : "+arr.indexOf(4));
			
			System.out.println("Index of 5 is : "+arr.lastIndexOf(5)); 
			
			 
	}

}

