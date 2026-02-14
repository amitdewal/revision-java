package tutorial_points;

import java.util.ArrayList;

public class Launch {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		
		int arr[] = {6,9,8};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(arr[0]);
		list.add(arr[2]);
		System.out.println(list);
		
		list.set(1, arr[1]);
		System.out.println(list);
		
		//list.remove(0);
		list.remove(new Integer(6));
		System.out.println(list);
	}

}
