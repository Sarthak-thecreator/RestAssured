package com.lti.generics;

public class GenericExample2 {

	public static void main(String[] args)
	{
		Integer[] i= {1,89,96,41,25};
		String[] s= {"Hi","Welcome"};
		System.out.println("Integer Array:");
		display(i);
		System.out.println("String array");
		display(s);
		

	}
	public static<E> void display(E[] elements)
	{
		for(E e:elements)
		{
			System.out.println(e);
		}
	}

}
