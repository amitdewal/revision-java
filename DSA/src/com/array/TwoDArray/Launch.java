package com.array.TwoDArray;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Launch {
@SuppressWarnings("resource")
public static void main(String[] args) {
	int [][] grid = new int [3][3];
	int m = grid.length;//no of rows
	int n = grid[0].length;//no of columns
	System.out.println(m);
	System.out.println(n);
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	//System.out.println("enter the values");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			 grid[i][j] = random.nextInt(10);
		}
	}
	
	// output
//	for (int i = 0; i < 3; i++) {
//		for (int j = 0; j < 3; j++) {
//			 System.out.print(grid[i][j]+" ");
//		}
//		System.out.println();
//	}
	
	
	//oytput using for each loop
	
	for(int[] ele:grid) {
		
		for(int num :ele) {
			System.out.print(num + " ");
		}
	}
	
}


}
