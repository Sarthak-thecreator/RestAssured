package com.lti.collections;

import java.util.*;
public class LinkedHashSetExample {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> LHSet = new LinkedHashSet<String>();
		LHSet.add("C");
		LHSet.add("D");
		LHSet.add("A");
		LHSet.add("B");
		LHSet.add("234");
		LHSet.add("123");
		LHSet.add("111");
		System.out.println("The LinkedHashSet elements are: "+LHSet);
		boolean b1= LHSet.remove("B");
		System.out.println(LHSet);
		boolean b2= LHSet.contains("B");
		System.out.println("Is B exists? " +b2);
		System.out.println("The Elements are "+LHSet);
	}

}
