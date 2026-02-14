package com.day10.pattern.special.composite;

import java.util.Scanner;

public class Launch {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("enter n:");
	int n = input.nextInt();
	
	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= n-i ; j++) {
				
			System.out.print(" "+ " ");
		}
		
		for (int j = 1; j <=i ; j++) {
			
			System.out.print(j+ " ");
		}
		System.out.println();// for new line or new row
	}
}
}
