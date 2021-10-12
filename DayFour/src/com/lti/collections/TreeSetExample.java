package com.lti.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args)
	{
		System.out.println("Tree Set Example!");
		TreeSet<Integer> tree =new TreeSet<Integer>();
		tree.add(12);
		tree.add(31);
		tree.add(345);
		tree.add(179);
		tree.add(222);
		Iterator iterator;
		iterator =tree.iterator();
		System.out.println("Tree set data:");
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println();
		if(tree.isEmpty())
		{
			System.out.println("Tree Set is empty");
		}
		else
		{
			System.out.println("Tree Set size: "+tree.size());
		}
		System.out.println("First Data: "+tree.first());
		System.out.println("Last data: " + tree.last());

		if (tree.remove(30)){

		System.out.println("Data is removed from tree set");
		}

		else {

		System.out.println("Data doesn't exist!");

		}

		System.out.print("Now the tree set contain: ");
		iterator = tree.iterator();

		while (iterator.hasNext()){
		System.out.print(iterator.next() + " ");

		}

		System.out.println();

		System.out.println("Now the size of tree set: " + tree.size());
		

		tree.clear();

		if (tree.isEmpty()){

		System.out.print("Tree Set is empty.");

		}

		else{

		System.out.println("Tree Set size: " + tree.size());
		}

		}
}
