package com.beyond.inherit;

import com.beyond.inherit.practice.Book;
import com.beyond.inherit.practice.Desktop;
import com.beyond.inherit.practice.SmartPhone;
import com.beyond.inherit.practice.Television;

public class Application {

	public static void main(String[] args) {

		// Desktop 객체 생성
//		Desktop desktop = new Desktop();
		Desktop desktop = new Desktop("애플", "a1111", "아이맥 24인치", 1800000, true);

		// SmartPhone 객체 생성
		SmartPhone smartphone = new SmartPhone("애플", "a2222", "아이폰12 미니", 1000000, "KT");

		Television television = new Television("엘지", "l3333", "벽걸이 TV", 2000000, 60);

		System.out.println(desktop.information());
		System.out.println(smartphone.information());
		System.out.println(television.information());

		// Object 클래스의 메소드 오버라이딩 테스트
		Book book1 = new Book("자바의 정석", "남궁성", 30000);
		Book book2 = new Book("자바의 정석", "남궁성", 30000);
		Book book3 = new Book("혼자 공부하는 자바", "신용권", 28000);
		
		System.out.println(book1.information());
		System.out.println(book2.information());
		System.out.println(book3.information());
		
		// 1. toString() 테스트
//		System.out.println(book1.toString());
//		System.out.println(book2.toString());
//		System.out.println(book3.toString());
//		System.out.println();
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println();
		
		// 2. equals() 테스트
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
		System.out.println(book1.equals(book3));
		System.out.println();
		
		// 3. hashCode() 테스트
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
		System.out.println(book3.hashCode());
//		System.out.println("Hello".hashCode());
//		System.out.println(new String("Hello").hashCode());
		System.out.println();
		
	}

}
