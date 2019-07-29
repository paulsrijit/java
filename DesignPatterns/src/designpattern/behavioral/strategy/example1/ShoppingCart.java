package designpattern.behavioral.strategy.example1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items;

	public ShoppingCart() {
		super();
		this.items = new ArrayList<>();;
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void buy(PaymentMethod paymentMethod) {
		paymentMethod.pay(items);
	}
}
