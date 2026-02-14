package com.start.shared;

public class Main {
public static void main(String[] args) {
	System.out.println("main method started");
	SharedResources obj = new SharedResources();
	
	
	Thread pt = new Thread(() ->{
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			
		}
		obj.addItem();
	});
	
	
	Thread ct = new Thread(() ->{
		
		obj.consumedItem();
	});
	pt.start();
	ct.start();
	System.out.println("main method end");
}
}
