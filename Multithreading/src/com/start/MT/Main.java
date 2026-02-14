package com.start.MT;

public class Main {

	public static void main(String[] args) {
		System.out.println("code executed by thread  "+Thread.currentThread().getName());
		MutlithreadingLearing mtObj = new MutlithreadingLearing();
		
		Thread th = new Thread(mtObj);
		th.start();
		
		System.out.println("thead is completed  "+Thread.currentThread().getName());
	}

}
