package com.lti.collections;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) 
	{
		HashSet<String> h= new HashSet<String>();
		h.add("Sarthak");
		h.add("Avinash");
		h.add("Java");
		h.add("C++");
		h.add("d");
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			System.out.println("Size "+h.size());
			h.remove("d");
			h.clear();
	}

}
