package com.lti.basics;

public class NarrowTypeCasting {
	public static void main(String[] args) {
        double d = 10.5; //Explicit conversion
        long l = (long)d;
        int i = (int)l;
        System.out.println("Double value "+d);
        System.out.println("Long value "+l);
        System.out.println("Int value "+i );
 
    }
}
