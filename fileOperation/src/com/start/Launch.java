package com.start;

import java.io.File;

public class Launch {
	
	public static void main(String[] args) {
		File f = null;
		String arr []= {"test1.txt","test2.txt"}; 
		
		for(String s:arr) {
			f = new File(s);
			boolean canExecute = f.canExecute();
			
			String path = f.getAbsolutePath();
			
			
			//print abs path
			System.out.println(path);
			
			
			// print exe or not
			
			System.out.println(canExecute);
		}
	}
	

}
