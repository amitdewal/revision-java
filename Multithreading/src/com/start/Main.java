package com.start;

/*multithreading
 * in java 
 * multi
 * */
public class Main {
	public static void main(String[] args) throws InterruptedException {
//		System.out.println(Thread.class);
//		System.out.println(Thread.class.getName());
//		System.out.println(Thread.class.getSimpleName());
//		System.out.println(Thread.currentThread());
//		System.out.println(Thread.currentThread().getThreadGroup());
//		System.out.println(Thread.currentThread().getPriority());
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getClass());
		 
//		System.out.println("hello focus here");
//		//Thread.sleep(3000);
//		System.out.println("thread is start running after nap");
		
		
		Thread ct = Thread.currentThread();
		System.out.println(ct);//Thread[main,5,main]
		System.out.println(ct.getName());
		System.out.println(ct.getPriority());
		ct.setName("myCustomThread");// set the name of the thread
		ct.setPriority(10);//priority changed to 10
		
		System.out.println(ct);//Thread[myCustomThread,10,main]
		System.out.println(ct.getName());
		System.out.println(ct.getPriority());
		System.out.println(ct.getThreadGroup().getClass());
	}
	
}
