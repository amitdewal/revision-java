package com.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
				try {
				byte arr[] = new byte[127];
				
				for(int i = 0; i < 127; i++) {
					arr[i] = (byte) (i+ 65);
				}
				FileOutputStream fo = new FileOutputStream("test.txt");
				
				for (int i = 0; i < arr.length; i++) {
					fo.write(arr[i]);
				}
				fo.close();
				
				   FileInputStream in = new FileInputStream("test.txt");
				   
				   int size = in.available();
				   
				   for (int i = 0; i < size; i++) {
					   
					   System.out.print((char)in.read() + " ");
					
				}
				   in.close();
				} catch (Exception e) {
				}
	}

}
