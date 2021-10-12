package com.lti.demos;

import java.time.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class ZonedDateAndTimeDemo {

	public static void main(String[] args) 
	{
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		ZonedDateTime currentZone = ZonedDateTime.now();
		System.out.println("CurrentZone" +currentZone.getZone());
		ZoneId z=ZoneId.of("Asia/Kolkata");
		ZonedDateTime z1=currentZone.withZoneSameInstant(z);
		System.out.println(z1);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
		String str=currentZone.format(formatter);
		System.out.println("Current date and time" +str);
	}

}
