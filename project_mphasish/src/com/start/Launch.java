package com.start;


class Resousce {
	
	String str = "";
	
}

class ThreadOne implements Runnable{

	
	
	@Override
	 public void run() {
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
	}
	
}


class ThreadTwo implements Runnable{

	@Override
	 public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(i);
		}
	}
	
}

public class Launch {
	
	
	public static void main(String[] args) {
		
		
		   ThreadOne obj1 = new ThreadOne();
		   Thread t1 = new Thread(obj1);
		   
		   
		   ThreadTwo obj2 = new ThreadTwo();
		   
		   Thread t2 = new Thread(obj2);
		   
		   t1.start();
		   t2.start();
		   
	}

}
