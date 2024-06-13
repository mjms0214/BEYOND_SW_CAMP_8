package com.beyond._interface;

import com.beyond._interface.practice.Basic;
import com.beyond._interface.practice.Desktop;
import com.beyond._interface.practice.SmartPhone;
import com.beyond._interface.practice.Television;

public class Application {

	public static void main(String[] args) {
		// 인터페이스는 객체 생성이 불가능하다.
		// 인터페이스를 구현하는 클래스를 통해서 객체를 생성해야 한다.
//		Basic basic = new Basic();
		
		// 인터페이스는 참조 변수로 사용이 가능하다.
		// 다형성을 적용해서 인터페이스를 구현하는 객체를 생성해서 참조할 수 있다.
		Basic basic = new Desktop("애플", "a1111", "아이맥 24인치", 1500000, true);
		
		basic.turnOn();
		basic.turnOff();
		System.out.println();
		
		// 배열의 다형성
		Basic[] array = new Basic[4];
		
		array[0] = new Desktop("애플", "a1111", "아이맥 24인치", 1500000, true);
		array[1] = new Desktop("삼성", "s1111", "매직스테이션", 2000000, false);
		array[2] = new SmartPhone("애플", "a2222", "아이폰12 미니", 1000000, "KT");
		array[3] = new Television("엘지", "l1111", "스마트 TV", 2000000, 40);
		
		for (Basic product : array) {
			product.turnOn();
			product.turnOff();
		}
		
		
	}

}
