package com.array;

import java.util.Scanner;

public class Main {
	 public static int majorityElement(int[] nums) {
	        
		 int n = nums.length;
		 int maxcount = 0;
		 
		 for (int i = 0; i < n; i++) {
			
			 int count = 0;
			 for (int j = 0; j < n; j++) {
				if(nums[i] == nums[j]) {
					count++;
				}
			}
			 
			 if( count > maxcount) {
				 maxcount = count;
			 }
		}
		 if(maxcount > n/2) {
			 return maxcount;
		 }
		return -1;
	    }
    
//    public static long factorial(long n) {
//        if( n == 0 || n == 1) {
//            return 1;
//        }
//        
//        return n* factorial(n-1);
//    }
	
public static long sequence(long n) {
	//base case
	if( n == 1) {
		return 1;
	}
	// for even
	else if( n % 2 == 0) {
		return sequence (n/2)+1;
	}else {// for odd
		return sequence (3*n+1)+1;
	}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      //long n = sc.nextLong();
      //System.out.println(sequence(n));
//    System.out.println(factorial(n));
      int arr [] = {3,2,3};
      System.out.println(majorityElement(arr));
    }
}