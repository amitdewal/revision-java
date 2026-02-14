package com.start;

class Test {
	
	String str = "Amit";
	
	public void change() {
	System.out.println("in mrthod");
		System.out.println(  str.toUpperCase());
	}
}



public class StringDemo {
	
	 public static void main(String[] args) {
		 System.out.println("main");
		 Runnable r1 = ()->{
			
			 new Test().change();
		  };
		  
		  
	}

}
