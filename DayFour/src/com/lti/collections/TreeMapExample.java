package com.lti.collections;

import java.util.TreeMap;

public class TreeMapExample
{

	public static void main(String[] args) 
	{
		System.out.println("Tree Map Example!");
		TreeMap <Integer,String> tMap= new 	TreeMap<Integer,String>();
		tMap.put(1,"Sunday");
		tMap.put(2,"Monday");
		tMap.put(3,"Tuesday");
		tMap.put(4,"Wednesday");
		tMap.put(5,"Thursday");
		tMap.put(6,"Friday");
		System.out.println("keys of tree map: "+tMap.keySet());
		System.out.println("Values of tree map: "+tMap.values());
		System.out.println("Key: 5 value:" +tMap.get(5)+"\n");
		System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));

		System.out.println("Now the tree map Keys: " + tMap.keySet());
		System.out.println("Now the tree map contain: " + tMap.values() + "\n");

		System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));

		System.out.println("Now the tree map Keys: " + tMap.keySet());
		System.out.println("Now the tree map contain: " + tMap.values());

	}

}