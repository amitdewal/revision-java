package com.dayNine.pattern;

import java.util.Scanner;

public class LaunchAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				// System.out.print(i+" ");
				// System.out.print(j+" ");
				System.out.print((char) (i + 64) + " ");// type cast from num to char
			}
			System.out.println();

		}
	}

}
