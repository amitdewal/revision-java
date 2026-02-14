package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Lanuch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the target element: ");
		int x = sc.nextInt();
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.print("enter the element of the array:  ");
		for(int i= 0; i < size; i++) {
			arr[i] =  sc.nextInt();
		}
		System.out.println(Arrays.toString(arr)); 
		
		//solution
		boolean flag = false;
		for(int i = 0; i < size; i++) {
			if(x == arr[i]) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("element found");
		}else {
			System.out.println("element not found");
		}
	}

}
