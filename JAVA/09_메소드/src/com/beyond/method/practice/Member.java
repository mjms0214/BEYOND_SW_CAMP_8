package com.beyond.method.practice;

public class Member {
	
	private String name;
	
	private int age;

	public Member() {
	}
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String information() {
		return String.format("이름은 %s이고, 나이는 %d입니다.", name, age);
	}
}
