package tutorial_points;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainLaunch {
	
	public static void main(String[] args) {
		
		String str = "amit dewal";
		
		String[] arr = str.split("");
		
		Map<String, Long> collect = Stream.of(arr)
				                           .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		
		String string = Stream.of(arr).sorted().collect(Collectors.joining(""));
		System.out.println(string.trim());
		
		
		
		collect.forEach((key, value) ->{
			
			if(!key.isBlank()) {
				System.out.println( key +"-"+  value  );
				
			}
		});
	}

}
