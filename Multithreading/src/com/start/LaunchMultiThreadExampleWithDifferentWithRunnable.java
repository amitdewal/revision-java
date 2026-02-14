package com.start;
class Test1 implements Runnable{
	public void run() {
System.out.println("banking task started");
		
		for (int i = 0; i <=3; i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("banking ............");
			
		}
		System.out.println("banking completed");
	}
	
}

class Test2 implements Runnable{
	
	public void run() {
		System.out.println("printing task started");
		for (int i = 0; i <=3; i++) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("priting ............");
			
		}
		System.out.println("priting completed");
	}
	
}

class Test3 implements Runnable{
	
	public void run() {
		System.out.println("calucaltion task started");
		for (int i = 0; i <=3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("calulating ............");
			
		}
		System.out.println("calulating completed");
	}
	
}
public class LaunchMultiThreadExampleWithDifferentWithRunnable {
public static void main(String[] args) throws InterruptedException {
	
	
	Thread t1 = new Thread(new Test1());
	Thread t2 = new Thread(new Test2());
	Thread t3 = new Thread(new Test3());
	
	t1.start();
	t2.start();
	t3.start();
}
}
