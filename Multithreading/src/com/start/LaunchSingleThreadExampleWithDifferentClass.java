package com.start;
class Demo1{
	public void banking() throws InterruptedException {
		System.out.println("banking task started");
		
		for (int i = 0; i <=3; i++) {
			Thread.sleep(2000);
			System.out.println("banking ............");
			
		}
		System.out.println("banking completed");
	}
}

class Demo2{
	public void printing() throws InterruptedException {
		
		System.out.println("printing task started");
		for (int i = 0; i <=3; i++) {
			Thread.sleep(2000);
			System.out.println("priting ............");
			
		}
		System.out.println("priting completed");
	}
}

class Demo3{
	public void calculation() throws InterruptedException {
		
		
		System.out.println("calucaltion task started");
		for (int i = 0; i <=3; i++) {
			Thread.sleep(2000);
			System.out.println("calulating ............");
			
		}
		System.out.println("calulating completed");
	}
}
public class LaunchSingleThreadExampleWithDifferentClass {
public static void main(String[] args) throws InterruptedException {
	
	Demo1 d1 = new Demo1();
	Demo2 d2 = new Demo2();
	Demo3 d3 = new Demo3();
	d1.banking();
	d2.printing();
	d3.calculation();
	
	
}
}
