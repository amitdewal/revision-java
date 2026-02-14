package com.start;

import java.util.Arrays;
import java.util.List;

//custom data type
class GenricProduct{
	int id;
	String productName;
	String price;
	
	public GenricProduct(int id, String productName, String price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "GenricProduct [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}
	
	
}


public class Launch {
	public static void main(String[] args) {
		
		List<GenricProduct> list = Arrays.asList(new GenricProduct(1, "tea", "20"),new GenricProduct(2, "milk", "30"));
		System.out.println(list);
		
	}
	
	

}
