package com.arraylist;
import java.util.ArrayList;

public class LaunchDemo {
	
	public static ArrayList<Integer> leaders(int arr[], int n){
		ArrayList<Integer> ans = new ArrayList<Integer> ();
	for(int i =0; i< n; i++) {
		
		for(int j = i + 1; j< n; j++) {
			if(arr[j] > arr[i]) {
				
				break;
			}
		}
		ans.add( arr[i]);
	}
	return ans;
	}
public static void main(String[] args) {
	int arr[] = new int[]{16, 17, 4, 3, 5, 2};
    int n = arr.length;
    System.out.println(leaders(arr,n));
}
}
