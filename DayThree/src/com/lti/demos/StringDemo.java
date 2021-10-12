package com.lti.demos;

import java.util.StringTokenizer;
public class StringDemo {

	public static void main(String[] args)
	{
		String s="Core";
		s=s.concat("JAVA");
		System.out.println("String class: "+s);
		StringBuffer sb=new StringBuffer("Core");
		sb.append("Java");
		System.out.println("StrigBuffer:"+sb);
		StringBuilder sbb=new StringBuilder("Core");
		sbb.append("Java");
		System.out.println("String Buillder" +sbb);
		String str="Hello! Welcome, to the Technical World";
		StringTokenizer st= new StringTokenizer(str,",");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
		StringTokenizer st1=new StringTokenizer(str);
		while(st1.hasMoreElements())
		{
			System.out.println(st1.nextElement());
		}
	}

}
