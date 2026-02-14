package today_;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*1,0,2,0,0,1,3,0,1,9*/
public class Main {
	
	public static Integer [] sorZeroAtEnd(Integer arr []) {
		
		
		for(int j = 0; j < arr.length; j++) {
			for(int i = 1; i < arr.length; i++){
				
				if(arr[i] > arr[i -1]) {
					
					int temp = arr[i];
					arr[i] = arr[i -1];
					arr[i-1] = temp ;
				}
			}
			}
		
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		
		Integer arr [] = {1,0,2,0,0,1,3,0,1,9};
		
		List<Integer> list = Stream.of(arr)
				                   .sorted(Comparator.reverseOrder())
				                   .collect(Collectors.toList());
		list.forEach((n) -> System.out.print(n +" "));
		System.out.println();
		
		Integer[] result = sorZeroAtEnd( arr);
		
		for( int i :result) {
			System.out.print(i + " ");
			
		}
	}
	
	
	

}
