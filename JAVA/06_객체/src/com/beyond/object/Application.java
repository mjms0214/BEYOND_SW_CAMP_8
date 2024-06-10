package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {
	
	public static void main(String[] args) {
		Person hong = new Person();
//		Person lee = new Person();
		
		hong.setName("홍길동");
		hong.setAge(24);
		hong.setPhone("애플", "아이폰 13", "화이트");
		hong.whoAreYou();
		
//		lee.setName("이몽룡");
//		lee.setAge(20);
//		lee.whoAreYou();
		
//		System.out.println(hong);
	}
}
