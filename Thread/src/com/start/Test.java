package com.start;

public class Test {
	
	public static void main(String[] args) {
		
		
		try {
			int i = 10/0;
			System.out.println("try");
		} finally {
			System.out.println("finally");
		}
	}

}
