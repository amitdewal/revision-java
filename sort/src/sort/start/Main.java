package sort.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*//{34, 90, 89, 71, 80, 22} desc   8 7 6 
*/
 
public class Main {
	
	
	public static void sortDesc(int[] arr) {
		
	
		
int n = arr.length;
		

for(int i = 0; i < n-1; i++) {
	
	
	for (int j = 1; j < n-2 ; j++) {
		
		if(arr[j-1] <  arr[j] ) {
			
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
		}
	}
	
}

		  ArrayList<Integer> list = new ArrayList<Integer>();
		  
		  for( int i  :arr) {
			  
			  list.add(i);
		  }
		  
		  
		  List<Integer> ansList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		  
		  System.out.println(ansList);
//System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static void main(String[] args) {
		 int arr[] = {34, 90, 89, 71, 80, 22};
		 
		 sortDesc(arr);
		 
	}
}
