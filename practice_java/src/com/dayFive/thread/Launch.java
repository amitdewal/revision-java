/*Runnable interface
 * 
 *  */

package com.dayFive.thread;

class RunnableThread implements  Runnable {
	@Override
	public void run() {
		try {
			System.out.println("thread "+Thread.currentThread().getId()+" is running");
		} catch (Exception e) {
			System.out.println("excception caught");
		}
	}
}

public class Launch {
public static void main(String[] args) {
	int n = 8;
	for (int i = 0; i < n; i++) {
		Thread obj = new Thread(new RunnableThread());
		obj.start();
		
	}
}
}
