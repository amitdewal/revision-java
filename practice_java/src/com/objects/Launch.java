package com.objects;


class Test{
}
public class Launch {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Class<?> cls = Class.forName("Test");
	
	Test test = (Test)cls.newInstance();
	System.out.println(test);
	
	
}
}
