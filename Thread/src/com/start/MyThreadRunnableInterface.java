package com.start;

public class MyThreadRunnableInterface implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("child thread from runnable interface");
		}
		
	}

}
