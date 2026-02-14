package com.array;

public class ArrayPassInMethod {
public static void main(String[] args) {
	int[] x = {5,10,56};
	for( int i :x) {
		System.out.print(i +" ");
	}
	
	System.out.println();
	change(x);
	for( int i :x) {
		System.out.print(i +" ");
	}
}

public static void change(int[] x) {
	x[0]=10;
}
}
