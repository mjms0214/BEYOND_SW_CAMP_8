package com.beyond.inherit.practice;

public class Television extends Product{

	private int    inch;  // 인치
	
	public Television() {
//		super();
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
	public String information() {
		
		return super.information() + String.format(", inch : %d\n", this.inch);
		
	}
	
	
}
