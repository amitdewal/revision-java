package tutorial_points;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound_exception {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("D://file.txt");
		System.out.println(file);
		FileReader fr = new FileReader(file);
		System.out.println(fr);
	}
	

}
