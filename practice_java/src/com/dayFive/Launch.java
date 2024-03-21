package com.dayFive;
class Fruit{
	
	public Fruit() {
		System.out.println("Fruit class constructor");
		System.out.println("Super class hashcode :: "+this.hashCode());
		System.out.println(this.getClass().getName());
	}
}

class Apple extends Fruit{
	public Apple() {
		System.out.println("Apple class constructor");
		System.out.println("Sub-class class hashcode :: "+this.hashCode());
		System.out.println(this.getClass().getName());
	}
}
public class Launch {
public static void main(String[] args) {
	Apple apple = new Apple();
}
}
