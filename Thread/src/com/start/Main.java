package com.start;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		MyThread t1 = new MyThread();
//		
//		t1.start();//starting child thread below this line two threads
//		 t1.start();
//		for (int i = 0; i < 5; i++) {
//			System.out.println("main -> "+  Thread.currentThread().getName());
//		}
		
		
		MyThreadRunnableInterface t1 = new MyThreadRunnableInterface();
		
		Thread th = new Thread(t1);
		
		
		th.start();
	}

}
