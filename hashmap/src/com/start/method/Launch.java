package com.start.method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class User {
    private String name;
    private int age;
    private boolean active;

    // Constructor
    public User(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", active=" + active + '}';
    }
}

public class Launch {
	
	public static void main(String[] args) {
		List<User> users = Arrays.asList(
                new User("Alice", 30, true),
                new User("Bob", 25, true),
                new User("Charlie", 35, false),
                new User("David", 28, true)
        );
		
		
		List<String> collect = users.stream().filter(User::isActive).filter(user -> user.getAge() > 26).map(user -> user.getName()).map(String::toUpperCase).collect(Collectors.toList());
	    System.out.println(collect);
	    
	    String str = "amit";
	    
	   
	    
	
	}

}
