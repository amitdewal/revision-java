package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Launch {
	
	public static  ArrayList<Integer> findDuplicate(int arr [], int n) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int temp = arr[i];
			
			for (int j = i+1; j < n; j++) {
				if(temp == arr[j]) {
					if(!list.contains(temp)) {
						list.add(temp);
					}
				}
			}
		}
		return list;
	}
public static void main(String[] args) {
	 
	int array[] = {1, 2, 3, 4 ,3};
	int n = array.length;
	ArrayList<Integer> list = findDuplicate(array, n);
	System.out.println(list);
	
//	ArrayList<Integer> list = new ArrayList<Integer>();
//	
//	list.add(10);
//	list.add(20);
//	list.add(30);
//	list.add(40);
//	if(!list.contains(50)) {
//		list.add(50);
//	}
//	System.out.println(list);
}
}