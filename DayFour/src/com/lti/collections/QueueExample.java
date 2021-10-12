package com.lti.collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {

			public static void main(String[] args) 
			{
				Queue<String> queue = new LinkedList<String>();
				queue.add("16");
				queue.add("3");
				queue.add("7");
				queue.offer("Item2");
				queue.offer("8");
				queue.offer("19");
				queue.offer("5");
				queue.offer("17");
				Iterator i=queue.iterator();
				while(i.hasNext())
				{
				System.out.println(i.next());
				}
				System.out.println("remove: " + queue.remove());
				System.out.println("element: " + queue.element());
				System.out.println("poll: " + queue.poll());
				System.out.println("peek: " + queue.peek());
			}




}		
