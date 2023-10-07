package task2;

public class OrderItem {
	private Product p;
	private int quality;

	public OrderItem(Product p, int quality) {
		this.p = p;
		this.quality = quality;
	}

	public Product getP() {
		return this.p;
	}

	public double showPrice() {
		return this.p.getPrice();
	}

	public String showType() {
		return this.p.getType();
	}

	@Override
	public String toString() {
		return "OrderItem [p=" + p + "]";
	}
	
	
	
	

}
