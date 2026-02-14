package com.day10.pattern.special;

import java.util.Scanner;

public class Launch3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter n:");
		int n = input.nextInt();
		int a = 1;
		//int mid = n / 2 + 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {

//				if(i % 2 != 0) {
//					if( j % 2 != 0) {// j is odd
//						System.out.print(1+ " ");
//					}else {// for j is even
//						System.out.print(0+ " ");
//					}
//				}else {// i is even
//					
//					if(j % 2 == 0) {
//					System.out.print(1+ " ");
//					}else {
//						System.out.print(0+" ");
//					}
//				}
				
				if((i + j) % 2 == 0) {
					System.out.print(1+ " ");
				}else {
					System.out.print(0+" ");
				}
				
			}
			System.out.println();// for new line or new row
		}
	}
}
