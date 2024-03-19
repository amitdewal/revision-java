package com.dayThree;

public class ThrowThrowsKyeword {
	
	public static void  help() {
		try {
			throw new NullPointerException("unknow exception");
		} catch (NullPointerException e) {
			System.out.println("caught inside help method");
			throw e;//re-throw the exception
		}
	}
public static void main(String[] args) {
	try {
		help();
	} catch (Exception e) {
		System.out.println("Caught in main error name given below:");
		e.printStackTrace();
	}
}
}

/*________________________OUTPUT______________________
 * caught inside help method Caught in main error name given below:
 * java.lang.NullPointerException: unknow exception at
 * com.dayThree.ThrowThrowsKyeword.help(ThrowThrowsKyeword.java:7) at
 * com.dayThree.ThrowThrowsKyeword.main(ThrowThrowsKyeword.java:15)
 */