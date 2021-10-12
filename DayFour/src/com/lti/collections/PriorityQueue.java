package com.lti.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("73");
		queue.add("122");
		queue.add("56");
		queue.offer("LTI");
		queue.offer("48");
		queue.offer("19");
		queue.offer("875");
		queue.offer("170");
		Iterator i=queue.iterator();
		while(i.hasNext()){
		System.out.println(i.next());
		}
		System.out.println("remove: " + queue.remove());
		System.out.println(queue);
		System.out.println("element: " + queue.element());
		System.out.println(queue);
		System.out.println("poll: " + queue.poll());
		System.out.println("peek: " + queue.peek());
	}
}
