package com.start.thread;

class HelloWorld extends Thread
{

	@Override
	public void run() {
		
		System.out.println("hello world");
	}
	
}

public class Main {
	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		obj.start();
	}

}
