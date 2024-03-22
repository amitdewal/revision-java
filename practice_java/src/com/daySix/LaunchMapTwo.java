package com.daySix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchMapTwo {
public static void main(String[] args) {
	 List<String> names = new ArrayList<>();
	 
     // add few String values
     names.add("Fidel");
     names.add("Abraham");
     names.add("Putin");
     names.add("Hitler");
     names.add("Robert");
     names.add("Amin");
     names.add("Napolean");
     System.out.println("before apply map");
     
     System.out.println(names);
     System.out.println("____________________________________");
     
     //stream create to convet to Upper case
     List<String> UpperCaselist = names.stream()
    		 				  .map(name -> name
    				          .toUpperCase()).collect(Collectors.toList());
     System.out.println("after apply map");
     System.out.println(UpperCaselist);
}
}

/*
 * before apply map
	[Fidel, Abraham, Putin, Hitler, Robert, Amin, Napolean]
____________________________________
after apply map
[FIDEL, ABRAHAM, PUTIN, HITLER, ROBERT, AMIN, NAPOLEAN]

 * 
 * 
 */
