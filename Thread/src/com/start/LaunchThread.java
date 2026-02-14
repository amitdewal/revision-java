package com.start;

class MyThread1 extends Thread{
	static Thread mt;

	@Override
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("child thread");
			}

	}
	
	
}

public class LaunchThread {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread1.mt = Thread.currentThread();
		
		Thread th = new Thread();
		th.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("main thread");
			
			Thread.sleep(2000);
			}
		
		
	}

}
