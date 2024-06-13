package com.beyond._interface.practice;

public class SmartPhone extends Product{
	
	private String mobileAgency; // 통신사
	
	public SmartPhone() {
	}

	public SmartPhone(String brand, String code, String name, int price, String mobileAgency) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String toString() {
		return "SmartPhone [mobileAgency=" + mobileAgency + ", brand=" + brand + ", code=" + code + ", name=" + name
				+ ", price=" + price + "]";
	}

	@Override
	public void turnOn() {
		System.out.println("스마트폰을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰을 끕니다.");
	}
	

}
