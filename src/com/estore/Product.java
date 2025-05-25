package com.estore;

public class Product {
	String name;
	int qty;
	int price;
	public Product(String name, int qty,int price) {
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product Name: "+ name + " " + "quantity: "+ qty + " " + "Price: " + price;
	}
}
