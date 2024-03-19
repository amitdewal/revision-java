package com.dayThree;

public class DemoException {
public static void main(String[] args) {
	String str = null;
	
	System.out.println(str.length());
	
	/*
	 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
	 * "String.length()" because "str" is null at
	 * com.dayThree.DemoException.main(DemoException.java:7)
	 */
}
}
