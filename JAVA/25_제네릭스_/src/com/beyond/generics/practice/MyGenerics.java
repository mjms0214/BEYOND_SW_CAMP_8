package com.beyond.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class MyGenerics {

	private String[] values;

	public MyGenerics(String[] values) {
		this.values = values;
	}
	
	public void print() {
		for (String value : values) {
			System.out.println(value);
		}
	}
	
	public List<String> toList(){
		List<String> list = new ArrayList<>();
		
		for (String value : values) {
			list.add(value);
		}
		
		return list;
	}
	
	
}
