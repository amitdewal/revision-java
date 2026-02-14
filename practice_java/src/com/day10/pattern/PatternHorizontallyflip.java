package com.day10.pattern;

import java.util.Scanner;

public class PatternHorizontallyflip {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter n:");
		int n = input.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n-i+1; j++) {
					System.out.print(j + " ");
				// System.out.print( (char)(64 +i) + " ");
			}
			System.out.println();// for new line or new row
		}
		
	}

}
