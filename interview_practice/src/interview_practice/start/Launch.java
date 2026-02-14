package interview_practice.start;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class Launch {
	public static void main(String[] args) {
		
//		HashSet<String> hs = new HashSet<String>();
//		boolean add = hs.add("red");
//		boolean add2 = hs.add("blue");
//		boolean add3 = hs.add("green");
//		boolean add4 = hs.add("red");
//		System.out.println(add);
//		System.out.println(add2);
//		System.out.println(add3);
//		System.out.println(add4);
//		System.out.println(hs);
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,8);
		
		Integer integer = list.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst().get();
		System.out.println(integer);
		
	}

}
