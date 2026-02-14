package qusDateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Launch {
	
	
	
	public static void main(String[] args) {
		String inputTime = "09:00 PM";
        int hoursToAdd = 3;
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(ofPattern);
		
		LocalTime parse = LocalTime.parse(inputTime,ofPattern);
		
		//System.out.println(parse);
		LocalTime plusHours = parse.plusHours(hoursToAdd);
		System.out.println(plusHours);
	}

}
