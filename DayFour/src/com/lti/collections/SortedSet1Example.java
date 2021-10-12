package com.lti.collections;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.tree.TreePath;

public class SortedSet1Example {

	public static void main(String[] args) 
	{
		SortedSet<String> ss=new TreeSet<String>();
		ss.add("a");
		ss.add("e");
		ss.add("g");
		ss.add("b");
		ss.add("c");
		Iterator it=ss.iterator();
		while(it.hasNext())
		{
		String value=(String)it.next();
		System.out.println("Value :"+value);
		

	}
}

}