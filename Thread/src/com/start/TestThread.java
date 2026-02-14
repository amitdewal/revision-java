package com.start;

class ThreadJoin extends Thread{

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("seeta thrad");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	
	
	
}

public class TestThread {
	public static void main(String[] args) throws InterruptedException {
		 ThreadJoin t = new ThreadJoin();
		 //System.out.println("name of thread:  "+Thread.currentThread().getName());
		 t.start();
		 
		 t.join(5000);// stoping the main thread
		 System.out.println("name of thread:  "+Thread.currentThread().getName());
		 
		 for (int i = 0; i < 5; i++) {
			System.out.println("Ram thread");
		}
		 
		 
		
	}
	
	
	

}
