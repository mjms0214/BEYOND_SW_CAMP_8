package com.beyond.di.pet;

public class Dog extends Pet{
	private String name;

	public Dog(String name) {
		this.name = name;
	}
	
	@Override
	public String bark() {
		return "멍멍~!";
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
}
