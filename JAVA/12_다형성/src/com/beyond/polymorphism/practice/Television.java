package com.beyond.polymorphism.practice;

public class Television extends Product{

	private int inch;  // 인치
	
	public Television() {
	}
	
	public Television(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return "Television [inch=" + inch + ", brand=" + brand + ", code=" + code + ", name=" + name + ", price="
				+ price + "]";
	}

	
}
