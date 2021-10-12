package com.lti.streams;

import java.util.*;
import java.util.stream.Collectors;
public class STREAMDEMO3 {

	public static void main(String[] args) 
	{
		List<Integer> num= new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(34);
		List<Integer> squares = num.stream().map(n->n*n).collect(Collectors.toList());
		squares.forEach(System.out::println);
	}

}
