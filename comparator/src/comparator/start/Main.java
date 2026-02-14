package comparator.start;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	 
    private int id;
    private String name;
    private long quantity;
    private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(int id, String name, long quantity, double price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
 
}
public class Main {
	
	public static void main(String[] args) {
		 
	List<Product> list = Arrays.asList(
							            new Product(105, "Wheat", 1089L, 36.89),
							            new Product(102, "Rice", 502L, 58.19),
							            new Product(103, "Lentils", 803L, 102.45),
							            new Product(104, "Oil", 208L, 164.75),
							            new Product(101, "Vegetables", 303L, 45.50)
            								);
	List<Product> li = list.stream().sorted(Comparator.comparing(Product::getId).reversed()).collect(Collectors.toList());
	
	li.forEach(i -> System.out.println(i));
	
	

}
}