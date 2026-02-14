package com.start;

import java.util.concurrent.LinkedBlockingDeque;

public class LaunchIOne {
	
	public static void main(String[] args) {
		
		
		LinkedBlockingDeque<String> que = new LinkedBlockingDeque<String>();
		
		que.add("sachin");
		que.add("dhoni");
		que.add("kohli");
		que.add("rohit");
		
		for (int i = 0; i < que.size(); i++) {
			System.out.println(que.getFirst());
			System.out.println(que.getLast());
		}
	}

}
