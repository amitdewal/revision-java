package com.dayThree;

public class NumberFormatExceptionExample {
public static void main(String[] args) {
	
	String str = "abc";
	
	try {
		int num = Integer.parseInt(str);
	} catch (NumberFormatException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());//msg--For input string: "abc"
		System.out.println(e.toString());//java.lang.NumberFormatException: For input string: "abc"
	}
}
}
