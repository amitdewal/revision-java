package com.start;
class Alpha extends Thread{
	public void run() {
		String t = Thread.currentThread().getName();
		System.out.println("thread is "+t);
		if(t.equals("BANK")) {
			banking();
		}else if(t.equals("PRINT")) {
			printing();
		}else {
			calculation();
		}
	}
	public void banking() {
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
	
	
	public void printing() {
		System.out.println("printing task started");
		
		for (int i = 0; i <=3; i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("printing ............");
			
		}
		System.out.println("printing completed");
	}
	
	public void calculation() {
		System.out.println("calculation task started");
		
		for (int i = 0; i <=3; i++) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("calculation ............");
			
		}
		System.out.println("calculation completed");
	}
}


public class LaunchSingleRunMethod {
	public static void main(String[] args) {
		
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		a1.setName("BANK");
		a2.setName("PRINT");
		a3.setName("CALC");
		a1.start();
		a2.start();
		a3.start();
			
	}

}
