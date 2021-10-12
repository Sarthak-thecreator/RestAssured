package com.lti.collections;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args)
	{
		System.out.println("Linked List Example!");
		 
		  LinkedList<String> list = new LinkedList<String>();
		  int size;
		  list.add("22");
		  list.add("abc");
		  list.add("Hai");
		  list.add("11");
		  size = list.size();
		  System.out.println(size);
		  System.out.println("The Elements are "+list);
		  for(String o:list){
		     
		      System.out.println(o);
		  }
		  System.out.print( "Linked list data: ");
		  Iterator it; 
		  it=list.iterator();
		  while (it.hasNext()){
		      System.out.println(it.next()+" ");
		      }
		  ListIterator<String> lit;
		  lit = list.listIterator();
		  while (lit.hasNext()){
		 System.out.println(lit.next()+" ");
		 }
		 
		  System.out.println();
		  while(lit.hasPrevious()){
		      System.out.println(lit.previous());
		  }
		  if (list.isEmpty()){
		  System.out.println("Linked list is empty");
		  }
		  else{
		  System.out.println( "Linked list size: " + size);
		  }
		  System.out.println("Adding data at 1st location: 55");

		  list.addFirst("55");
		  System.out.println(list);
		  list.add(2,"88");
		  System.out.println(list);
		  Collections.sort(list);
		  System.out.println("sort "+list);
		  Collections.reverse(list);
		  
		  System.out.print("Now the list contain: ");
		  it = list.iterator();
		  while (it.hasNext()){
		  System.out.print(it.next()+" ");
		  }
		  System.out.println();
		  System.out.println("Now the size of list: " + list.size());
		
	}

}
