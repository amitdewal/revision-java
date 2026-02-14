package today_;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	
	private String item;
	private double  price;
	public Product(String item, double price) {
		super();
		this.item = item;
		this.price = price;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [item=" + item + ", price=" + price + "]";
	}
	
	
	
}

public class LaunchAvg {

	public static void main(String[] args) {
		
		
		List<Product> list = Arrays.asList(   new Product("item1", 10), 
								              new Product("item1", 20),
								              new Product("item2", 50),
								              new Product("item2", 30));
		list.forEach((li) -> System.out.println(li));
		
		
	
		
		// avgerage

	}

}
	