package com.lti.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		ArrayList<Object>a1=new ArrayList<Object>();
		Integer i1=new Integer(23);
		Integer i2=new Integer(89);
		Integer i3= new Integer(93);
		Integer i4= new Integer (45);
		String s1="India";
		System.out.println("The size of the arraylist is : " +a1.size());
		a1.add(i1);
		a1.add(i2);
		a1.add(s1);
		System.out.println(a1);
		System.out.println("The contents of arraylist is: "+a1);
		System.out.println("The size of the arraylist is: "+a1.size());
		a1.add(i1);

		a1.add(i2);

		a1.add(i3);

		a1.add(i4);
		
		Integer i5= new Integer(50);
		a1.add(i5);
		a1.trimToSize();
		System.out.println("The content of arraylist is: " + a1);
		System.out.println("The size of an arraylist is: " + a1.size());
		a1.remove(3);
		System.out.println(a1);

		 Object a=a1.clone();

		System.out.println("The clone is: " + a);

		 a1.remove(3);

		System.out.println("The content of arraylist is: " + a1);

		 System.out.println("The size of an arraylist is: " + a1.size());
		if(a.equals(a1))

	System.out.println("Equal");

		 else

		 System.out.println("Not Equal");

		 for(Object o:a1){

		 System.out.println(o);

	}

}
}
