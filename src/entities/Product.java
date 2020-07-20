package entities;

public class Product {
	private String name;
	private Double price;
	
	//construtor
	public Product() {
		
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	//get & set
	public String getProductName() {
		return name;
	}
	public void setProductName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
}
