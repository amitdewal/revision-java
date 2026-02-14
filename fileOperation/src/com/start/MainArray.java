package com.start;

public class MainArray {

	public static void main(String[] args) {

		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {

				if (arr[i] % 2 == 1) {
					sum += arr[i];
				}
			}

		}
		System.out.println(sum);

	}

}
