package com.day10.pattern.special;

import java.util.Scanner;

public class Launch2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter n:");
		int n = input.nextInt();
		int mid = n/2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
					
				if(i == j|| (i + j) == (n + 1)){
					System.out.print("*"+ " ");
				}else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();// for new line or new row
		}
	}
}
