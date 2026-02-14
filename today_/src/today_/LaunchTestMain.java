package today_;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchTestMain {

	public static void main(String[] args) {
		
		
		String str = "amit dewal";
		
		
		String[] split = str.split("");
		
		
		for(String as:   split) {
			System.out.println(as);
		}

		
		
		Map<String, Long> collect = Stream.of(str.split(""))
				                          .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			
		
		collect.forEach((index, value) -> {
								if( !index.isBlank()) {
									System.out.println( index + " ->"+ value);
								}
	                          });

}
}