package com.beyond._interface.practice;

public class Desktop extends Product {
	
	private boolean allInOne; // 일체 여부
	
	public Desktop() {
	}
	
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		
		this.brand = brand;
		this.name = name;
		super.code = code;
		super.price = price;
		
		this.allInOne = allInOne;
		
	}

	public boolean isAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String toString() {
		return "Desktop [allInOne=" + allInOne + ", brand=" + brand + ", code=" + code + ", name=" + name + ", price="
				+ price + "]";
	}

	@Override
	public void turnOn() {
		System.out.println("데스크톱을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("데스크톱을 끕니다.");
	}
	

	
}
