package com.tns.springcore.xmllife;

public class Dog {
	private double price;
	private String name;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dog [price=" + price + ", name=" + name + "]";
	}
	
	public void init() {
		System.out.println("initializing");
	}
	public void destroy() {
		System.out.println("destroying");
	}
	

}
