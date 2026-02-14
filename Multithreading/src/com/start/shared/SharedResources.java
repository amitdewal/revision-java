package com.start.shared;

public class SharedResources {
	boolean itemAvailabe = false;
	
	public synchronized void addItem() {
		itemAvailabe = true;
	System.out.println("item added by thread "+Thread.currentThread().getName() );
	notify();
		
	}
	
	
	public synchronized void consumedItem() {
		System.out.println("consumer method is invoked by "+Thread.currentThread().getName());
		
		if(!itemAvailabe) {
			try {
				System.out.println("Thread "+Thread.currentThread().getName()+" is waiting now");
				wait();// it release the monitor lock
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("item consumed by "+Thread.currentThread().getName());
		itemAvailabe = false;
	}

}
