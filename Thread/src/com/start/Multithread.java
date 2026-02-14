package com.start;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Multithread {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
//		squareList(list);
//		doubleList(list);
//		tripeList(list);
		
		Thread t1 = new Thread(() ->{
			System.out.println(Thread.currentThread().getName());
			squareList(list);
		}, "Square thread");
		
		Thread t2 = new Thread(() ->{
			System.out.println(Thread.currentThread().getName());
			doubleList(list);
		},"Double thread");
		
		
		 Thread t3= new Thread(() ->{
			 System.out.println(Thread.currentThread().getName());
			 tripeList(list);
		 },"Triple thread");
		 
		 t1.start();
		 t2.start();
		 t3.start();
	}

	private static void tripeList(ArrayList<Integer> list) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
        List<Integer> triple_list = list.stream().map(i -> i * 3).collect(Collectors.toList());
		
		triple_list.forEach(n -> System.out.print(n +" "));
		System.out.println();
		
	}

	private static void doubleList(ArrayList<Integer> list) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		List<Integer> double_list = list.stream().map(i -> i * 2).collect(Collectors.toList());
		
		double_list.forEach(n -> System.out.print(n +" "));
		System.out.println();
	}

	private static void squareList(ArrayList<Integer> list) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
	}
		
		List<Integer> square_list = list.stream().map(num -> num * num).collect(Collectors.toList());
		
		square_list.forEach(n -> System.out.print(n+" "));
		System.out.println();
	}

}
