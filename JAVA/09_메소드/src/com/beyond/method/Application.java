package com.beyond.method;

import com.beyond.method.practice.A_Method;
import com.beyond.method.practice.Member;

public class Application {

	public static void main(String[] args) {
		A_Method methodTest = new A_Method();
		
		// 1. 매개변수와 반환값이 없는 메소드 호출
		methodTest.method1();
		System.out.println();
		
		// 2. 매개변수가 없고 반환값이 있는 메소드 호출
		String msg = methodTest.method2();
		
		System.out.println(msg);
		System.out.println();
		
		// 3. 매개변수가 있고 반환값이 없는 메소드 호출
		methodTest.method3(10, 20);
		System.out.println();
		
		// 4. 매개변수가 있고 반환값이 있는 메소드 호출
		System.out.printf("10 X 20 = %d 입니다.\n", methodTest.method4(10, 20));
		System.out.println();
		
		// 5. 매개변수로 객체를 전달받는 메소드 호출
		Member member = new Member("홍길동", 24);
		
		System.out.println(member.information());
		methodTest.method5(member);
		System.out.println(member.information());
		
		// 6. 매개변수로 가변인자를 전달받는 메소드 호출
		methodTest.method6();
	}

}
