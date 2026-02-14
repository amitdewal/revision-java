package producer_consumer.start;

import java.util.LinkedList;

public class PC {
	
	LinkedList<Integer> list =new LinkedList<Integer>();
	
	int capacity = 5;
	
	public void producer() throws InterruptedException {
		
		int value = 0;
		
		while(true) {
			synchronized (this) {
				if(list.size() == capacity) {
					wait();
				}
				System.out.println("producer produced "+value);
				
				list.add(value++);
				
				notify();
				
				Thread.sleep(1000);
			}
		}
	}
	
	
	public void consume() throws InterruptedException {
		
		while(true) {
			synchronized (this) {
				
				if(list.size() == 0) {
					wait();
				}
				
				Integer val = list.removeFirst();
				System.out.println("Consumer consumed "+ val);
				
				notify();
				
				Thread.sleep(1000);
			}
		}
	}

}
