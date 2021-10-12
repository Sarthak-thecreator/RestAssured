package com.lti.streams;

import java.util.*;
import java.util.stream.Collectors;
public class StreamDemo2 {

	public static void main(String[] args)
	{
		List<String> names=Arrays.asList("Abhinav Singh","Ravi Sinha","Arun","Avinash");
		List<String> longnames = names.parallelStream().filter(str->str.length()>5 && str.length()<10).collect(Collectors.toList());
		longnames.forEach(System.out::println);
		
	}

}
