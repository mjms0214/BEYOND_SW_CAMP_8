package com.beyond.object.practice;

// 접근 제한자 생략 시 default 접근 제한이 적용된다.
class Phone {
	// 1. 필드 정의
	private String brand;
	private String name;
	private String color;
	
	// 2. 생성자 정의
	public Phone() {
		
	}

	// 3. 메소드 정의
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

}
