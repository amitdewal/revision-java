package com.start.thread.mt;

public class Main {
	
	final private static  int MAX_NUMBER = 20;
	 private  static Object lock = new Object();
	 private static boolean isEvenTurn = true;
	 
	
	public static void main(String[] args) {
		
		 Thread evenThread = new Thread(() ->{
			 
			 
			 for(int i = 2; i <= MAX_NUMBER; i+=2) {
				 
				 synchronized (lock) {
					 
					 while(!isEvenTurn) {
						 try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					 }
					 
					 System.out.println("even number from even thread "+i);
					 isEvenTurn = false;
					 lock.notify();
					
				}
			 }
		 });
		 
		 
		 Thread oddThread = new Thread(()->{
			 
			 
			 for (int i = 1; i <= MAX_NUMBER; i+=2) {
				
				 
				 
					 synchronized (lock) {
						while(isEvenTurn) {
						 try {
							lock.wait();
						} catch (InterruptedException e2) {
							e2.printStackTrace();
						}
						}
						System.out.println("odd number from odd thread   "+i);
						System.out.println();
						isEvenTurn = true;
						lock.notify();
					}
				 
			}
		 });
		 
		 evenThread.start();
		 oddThread.start();
		
	}

}
