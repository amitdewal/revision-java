package com.start.lock;

public class MonitorLockExample {
		
	
	public synchronized void  task1() {
		System.out.println("inside task1  " + Thread.currentThread().getName());
		System.out.println();
		try {
			Thread.sleep(10000);
			System.out.println("task1 completed " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void task2() {
		System.out.println("task2 but before synchronous " + Thread.currentThread().getName());
		System.out.println();
		
		synchronized (this) {
		System.out.println("task2 but after synchronous " + Thread.currentThread().getName());
		}
	}
	
	public void task3() {
		System.out.println("inside task3 " + Thread.currentThread().getName());
	}
}
