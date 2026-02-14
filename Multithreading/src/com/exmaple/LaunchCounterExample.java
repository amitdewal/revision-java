package com.exmaple;

class CounterClass{
	int count=0;
	
	synchronized void increamentCounter() {
		System.out.println(Thread.currentThread().getName());
			count++;
			//Thread.currentThread().sleep(100);
			
		
			
	}
	
	int getCounter() {
		return this.count;
	}
}


class IncreamentThread  extends Thread{
	CounterClass c ;
	
	public IncreamentThread(CounterClass c){
		this.c = c;
	}

	@Override
	public void run() {
	 for (int i = 1; i <= 20; i++) {
		c.increamentCounter();
	}
	 System.out.println(c.getCounter());
	}
	
	
	
}

public class LaunchCounterExample {
	
	public static void main(String[] args) {
		  CounterClass obj = new CounterClass();
		  
		   IncreamentThread t1 = new IncreamentThread(obj);
		   IncreamentThread t2 = new IncreamentThread(obj);
		   
		   t1.start();
		   t2.start();
		  
		  
		   
	}

}
