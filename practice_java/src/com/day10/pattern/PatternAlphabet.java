package com.day10.pattern;

import java.util.Scanner;

public class PatternAlphabet {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("enter n:");
	int n = input.nextInt();
	
	for (int i = 1; i <= n; i++) {
		
		for (int j = 1; j <= i; j++) {
			//System.out.print( (char)(64 +i) + " ");
			System.out.print( (char)(64 +j) + " ");
		}
		System.out.println();//for new line or new row
	}
}
}
