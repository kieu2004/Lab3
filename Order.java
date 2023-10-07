package task2;

import java.util.ArrayList;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		this.items = items;
	}

	public double cost() {
		double totalCost = 0;
		for (OrderItem orderItem : items) {
			totalCost += orderItem.showPrice();
		}
		return totalCost;
	}

	// using binary search approach
	public boolean contains(Product p) {
		int low = 0;
		int high = items.length - 1;
		while (low <= high) {
			int center = (low + high) / 2;
           if(items[center].getP().compareTo(p)==0) {
        	   return true;
           }else if(items[center].getP().compareTo(p) > 0) {
        	   high=center-1;
           }else {
        	   low=center+1;
           }
		}
		return false;
	}

	// using iterative search approach
	public boolean contains_cach2(Product p) {
		for (OrderItem orderItem : items) {
			if (orderItem.getP().equals(p)) {
				return true;
			}
		}
		return false;
	}

	// get all products based on the given type using
	// linear search
	public Product[] filter(String type) {
		ArrayList<Product> productsList = new ArrayList<>();
		for (OrderItem orderItem : items) {
			if (orderItem.showType().equals(type)) {
				productsList.add(orderItem.getP());
			}
		}

		// Chuyển ArrayList thành mảng 1 chiều
		Product[] productsArr = productsList.toArray(new Product[productsList.size()]);
		return productsArr;
	}

}
