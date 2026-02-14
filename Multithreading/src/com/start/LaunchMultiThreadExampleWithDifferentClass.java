package com.start;
class DemoOne extends Thread{
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

class DemoTwo extends Thread{
	
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

class DemoThree extends Thread{
	
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
public class LaunchMultiThreadExampleWithDifferentClass {
public static void main(String[] args) throws InterruptedException {
	
	DemoOne d1 = new DemoOne();
	DemoTwo d2 = new DemoTwo();
	DemoThree d3 = new DemoThree();
	d1.start();
	d2.start();
	d3.start();
}
}
