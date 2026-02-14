package interview_practice.start.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Launch {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("mno");
		list.add("xyz");
		list.add("abc");
		System.out.println(list);
		Collections.sort(list, Comparator.naturalOrder());
		System.out.println(list);
		
		
	}

}
