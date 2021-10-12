package com.lti.collections;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) 
	{
		HashMap<String,Object>hash= new HashMap<String,Object>();
		hash.put("roll", new Integer(12));
		hash.put("name", "jack");
		hash.put("age", new Integer(22));
		System.out.println(hash.get("roll"));
		Set s= hash.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
