package com.dayFive.thread;

import java.util.Iterator;

/*multithreading in java
 * Thread class  
 * 
*/

class Multithreading extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}
	}
}
public class Main {
public static void main(String[] args) {
	int n = 8;
	
	for (int i = 0; i < n; i++) {
		Multithreading obj = new Multithreading();
		obj.start();
	}
}
}
