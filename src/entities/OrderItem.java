package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	private Product product;
	
	//construtor
	public OrderItem() {
		
	}
	public OrderItem(Integer quantity) {
		this.quantity = quantity;
	}
	
	//get & set
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice() {
		this.price = product.getPrice();
	}
	
	//metodos
	public double subTotal() {
		double totalValue = quantity * price;
		return totalValue;		
	}
}
