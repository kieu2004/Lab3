package task2;

import java.util.Objects;

public class Product {
	private String id;
	private String name;
	private double price;
	private String type;

	public Product(String id, String name, double price, String type) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public double getPrice() {
		return this.price;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return id+" "+name+" "+price+" "+type;
	}

	public String getType() {
		return this.type;
	}
	
	public int compareTo(Product p) {
		if(id.compareTo(p.getId())==0) {
			return this.name.compareTo(p.getName());
		}
			return id.compareTo(p.getId());
	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return this.id.equals(other.getId()) && this.name.equals(other.getName())
				  && this.price== other.getPrice() && this.type.equals(other.getType());
	}


}
