package com.dayThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*Exception Types*/
public class ExceptionTypes {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
	try {
		
		File file = new File("D://test.txt");
		FileReader fr = new FileReader(file);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println(e.toString());
	}
}
}
