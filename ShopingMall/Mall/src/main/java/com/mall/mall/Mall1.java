package com.mall.mall;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mall1")
public class Mall1 {
	
	private int id;
	private String Mall1Admin;
	private String Mall1Name;
	private String location;
	private int shopid;
	private String category;
	
	
	public Mall1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Mall1(int id, String Mall1Admin, String Mall1Name, String location, int shopid, String category) {
		super();
		this.id = id;
		this.Mall1Admin = Mall1Admin;
		this.Mall1Name = Mall1Name;
		this.location = location;
		this.shopid = shopid;
		this.category = category;
	}

	@Id
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMall1Admin() {
		return Mall1Admin;
	}


	public void setMall1Admin(String Mall1Admin) {
		this.Mall1Admin = Mall1Admin;
	}


	public String getMall1Name() {
		return Mall1Name;
	}


	public void setMall1Name(String Mall1Name) {
		this.Mall1Name = Mall1Name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getShopid() {
		return shopid;
	}


	public void setShopid(int shopid) {
		this.shopid = shopid;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Mall1 [id=" + id + ", Mall1Admin=" + Mall1Admin + ", Mall1Name=" + Mall1Name + ", location=" + location
				+ ", shopid=" + shopid + ", category=" + category + ", getId()=" + getId() + ", getMall1Admin()="
				+ getMall1Admin() + ", getMall1Name()=" + getMall1Name() + ", getLocation()=" + getLocation()
				+ ", getShopid()=" + getShopid() + ", getCategory()=" + getCategory() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
