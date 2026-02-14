package com.start;

public class Main {

	static int findFirstOccurance(int arr[], int key) {

		int n = arr.length;
		int start = 0;
		int end = n - 1;

		int catchkey = Integer.MAX_VALUE;

		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (arr[mid] == key) {

				catchkey = mid;
				return catchkey;
			}

			else if (arr[mid] > key) {

				end = mid - 1;
			}

			else {
				start = mid + 1;
			}

		}
		return catchkey;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 5, 5, 6, 6, 8, 9, 9, 9 };
		int key = 5;
		System.out.println(findFirstOccurance(arr, key));

	}

}
