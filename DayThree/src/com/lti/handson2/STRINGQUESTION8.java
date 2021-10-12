package com.lti.handson2;

public class STRINGQUESTION8 {

	public static void main(String[] args)
	{
		String s="Try to learn something about everything and everything about something";
		System.out.println(s.charAt(10));
		System.out.println(s.contains("is"));
		System.out.println(s + " otherwise fix it ");
		System.out.println(s.endsWith("how"));
		String s1="Try to learn something about Everything and Everything about SOmehting";
		System.out.println(s.equals(s1));
		System.out.println(s.equals("Try to learn something about everything and everything about something"));
		System.out.println(s.indexOf("a"));
		int l=s.lastIndexOf("e");
		System.out.println(l);
		System.out.println(s.length());
		
	}

}
