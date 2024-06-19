package com.beyond.generics.practice;

import java.util.ArrayList;
import java.util.List;

//public class MyGenerics<T> {
public class MyGenerics<T extends Number> {
	private T[] values;

	public MyGenerics(T[] values) {
		this.values = values;
	}
	
	public void print() {
		for (T value : values) {
			System.out.println(value);
		}
	}
	
	public List<T> toList(){
		List<T> list = new ArrayList<>();
		
		for (T value : values) {
			list.add(value);
		}
		
		return list;
	}
}
