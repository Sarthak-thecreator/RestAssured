package com.lti.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) 
	{
		long count=1;
		List<String> names=new ArrayList<String>();
		names.add("Sarthak");
		names.add("Arun");
		names.add("Sandeep");
		names.add("Abhishek");
		count= names.stream().filter(s->s.length()>5).count();
		System.out.println("There are "+count+ " names whose length is greater than 5");
	}

}
