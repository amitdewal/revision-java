package com.start;

public class LaunchSingleThreadExample {
public static void main(String[] args) throws InterruptedException {
	
	System.out.println("banking task started");
	
	for (int i = 0; i <=3; i++) {
		Thread.sleep(2000);
		System.out.println("banking ............");
		
	}
	System.out.println("banking completed");
	System.out.println("------------------------------------");
	
	System.out.println("printing task started");
	for (int i = 0; i <=3; i++) {
		Thread.sleep(2000);
		System.out.println("priting ............");
		
	}
	System.out.println("priting completed");
	System.out.println("------------------------------------");
	
	
	System.out.println("calucaltion task started");
	for (int i = 0; i <=3; i++) {
		Thread.sleep(2000);
		System.out.println("calulating ............");
		
	}
	System.out.println("calulating completed");
}
}
