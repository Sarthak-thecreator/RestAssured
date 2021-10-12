package com.lti.handson2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Question9 {

	public static void main(String[] args) 
	{
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm:ss a");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Time with am/pm field=");
		System.out.println(df.format(now));
	}

}
