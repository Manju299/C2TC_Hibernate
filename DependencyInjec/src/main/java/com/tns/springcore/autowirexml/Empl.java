package com.tns.springcore.autowirexml;

public class Empl {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Empl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Empl [address=" + address + "]";
	}
	
	
	
	
	

}
