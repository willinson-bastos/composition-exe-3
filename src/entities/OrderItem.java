package entities;

public class OrderItem {
	private Integer quantity;
	
	private Product product;
	
	//construtor
	public OrderItem() {
		
	}
	public OrderItem(Integer quantity,Product product) {
		this.quantity = quantity;
		this.product = product;
	}
	
	//get & set
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	//metodos
	public double subTotal() {
		double totalValue = quantity * product.getPrice();
		return totalValue;		
	}
}
