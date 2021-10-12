package com.lti.demos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Month;
public class DateAndTimeAPI 
{
	public static void main(String[] args) 
	{
		LocalDate date=LocalDate.now();
		System.out.println("Date" +date);
		LocalTime time=LocalTime.now();
		System.out.println("Time" +time);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println("Date and Time" +dt);
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
		String str=dt.format(formatter);
		System.out.println("Current date and time" +str);
		Month month=dt.getMonth();
		int day=dt.getDayOfMonth();
		int hours =dt.getHour();
		System.out.println("Month" +month);
		System.out.println("Day" +day);
		System.out.println("Hours" +hours);
		LocalDate date1=LocalDate.of(1947,8,15);
		System.out.println("Independence Day" +date);
		LocalDateTime dt1= dt.withDayOfMonth(21).withYear(2017).withMonth(06).withHour(3);
		System.out.println(dt1);
	}
}
