package entities;

public class OrderItem {
	private Integer quantity;
	private Double price;
	
	//construtor
	public OrderItem() {
		
	}
	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
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
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//metodos
	public double subTotal() {
		double totalValue = quantity * price;
		return totalValue;		
	}
}
