package com.beyond._interface.practice;

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

	@Override
	public void turnOn() {
		System.out.println("텔레비전을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다.");
	}

	
}
