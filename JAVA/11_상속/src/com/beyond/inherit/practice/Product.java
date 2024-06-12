package com.beyond.inherit.practice;

public class Product {

//	private String brand;
//	private String code;
//	private String name;
//	private int    price;
	
	protected String brand;
	protected String code;
	protected String name;
	protected int    price;

	public Product() {
		System.out.println("부모 클래스의 기본 생성자 호출");
	}

	public Product(String brand, String code, String name, int price) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
		
		return String.format("brand : %s, code : %s, price : %d, name : %s",
				this.brand, this.code, this.price, this.name);
		
	}
}
