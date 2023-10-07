package task2;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {

		Product p1 = new Product("001", "Snack", 56, "Food");
		Product p2 = new Product("007", "Snack", 20, "Food");
		Product p3 = new Product("003", "StrawberryIce", 14.5, "Ice-cream");
		Product p4 = new Product("006", "Lemon", 49, "Dink");
		Product p5 = new Product("001", "Coca", 23.5, "Dink");

		OrderItem i1 = new OrderItem(p1, 2);
		OrderItem i2 = new OrderItem(p2, 1);
		OrderItem i3 = new OrderItem(p3, 2);
		OrderItem i4 = new OrderItem(p4, 3);
		OrderItem i5 = new OrderItem(p5, 3);

		OrderItem[] orderItems = { i1, i2, i3, i4, i5 };
		Order order = new Order(orderItems);

		System.out.println("Total price of each product: " + order.cost());
		System.out.println("All products based on the Dink type: ");
		System.out.println(Arrays.toString(order.filter("Dink")));
		System.out.println("=================================");
		System.out.println(Arrays.toString(order.filter("Food")));
		
        //Sort each oderItem
		Arrays.sort(orderItems, new Comparator<OrderItem>() {

			@Override
			public int compare(OrderItem o1, OrderItem o2) {
			if(o1.getP().getId().equals(o2.getP().getId())) {
				return o1.getP().getName().compareTo(o2.getP().getName());
			}
				return o1.getP().getId().compareTo(o2.getP().getId());
			}

		});

		System.out.println(Arrays.toString(orderItems));
		
		Product p0= new Product("113", "Coca", 7.8, "Drink");
		System.out.println("Product ( "+p3+" ) is contained in orderItems: "+order.contains(p3));
		System.out.println("Product ( "+p3+" ) is contained in orderItems: "+order.contains_cach2(p3));
		System.out.println("Product ( "+p0+" ) is contained in orderItems: "+order.contains(p0));
		System.out.println("Product ( "+p0+" ) is contained in orderItems: "+order.contains_cach2(p0));
		

	}
}
