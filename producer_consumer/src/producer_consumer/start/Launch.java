package producer_consumer.start;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Launch {
	
	public static void main(String[] args) {
		
		String[] aaa = {"abcd", "time", "bcda", "dabc", "meti", "xyza", "cadb", "cdba" };
		
		Stream.of(aaa)
			  .sorted(Comparator.naturalOrder())
			  .forEach(System.out::println);
	    //System.out.println(collect);
		
		Stream.of(aaa)
			  .sorted(Comparator.naturalOrder())
			  .map(String::toUpperCase)
			  .forEach(System.out::println);
		
		
	System.out.println();
	String str = "aaabbbcccfffdd";
	
	Map<String, Long> collect = Stream.of(str.split("")).collect(Collectors.groupingBy(ele -> ele,Collectors.counting()));	
	     System.out.println( collect);
	}

}
