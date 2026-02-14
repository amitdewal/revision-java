package com.start.qus;

class Clothing{
	public String size;
	public double price;
	
	public Clothing(String size, double price) {
		super();
		this.size = size;
		this.price = price;
	}
}


class Customer {
	public String size;
}

public class Launch {
	
	public static void main(String[] args) {
		
		
		 Customer c = new Customer();
		 c.size="M";
		 
		 
		 Clothing[] items =  new Clothing[5];
		 
		    items[0] = new Clothing("M", 20); // Example Clothing objects
	        items[1] = new Clothing("L", 30);
	        items[2] = new Clothing("M", 25);
	        items[3] = new Clothing("S", 15);
	        items[4] = new Clothing("M", 35);
	        
	        double total_price = 0.0;
	        
	        for(Clothing item :items) {
	        	if(item.size.equals(c.size)) {
	        		total_price += item.price;
	        	}
	        }
	        
	        System.out.println(c.size + " = "+ total_price);
	}

}
