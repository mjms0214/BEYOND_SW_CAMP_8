package com.beyond.staticmember.practice;

import java.util.Iterator;

public class B_StaticMethod {
	
	private static int num1 = 10;
	private static int num2 = 20;
	private int num3 = 30;
	
	// 1. 매개변수와 반환값이 없는 정적 메소드
	public static void method1() {
		System.out.println(num1 + num2++);
		
		// 정적 메소드에서 필드에 접근할 수 없다.
		// 정적 메소드는 객체를 생성하지 않고 사용하기 때문에 필드에 접근할 수 없다.
//		System.out.println(num3);
	}
	
	// 2. 매개변수가 없고 반환값이 있는 정적 메소드
	public static int method2() {
//		int num1 = 1;
//		int num2 = 2;
		
		return B_StaticMethod.num1 + B_StaticMethod.num2;
	}
	
	// 3. 매개변수가 있고 반환값이 없는 정적 메소드
	public static void method3(int num3) {
		System.out.println(B_StaticMethod.method2() + num3);
	}
	
	// 4. 매개변수가 있고 반환값도 있는 정적 메소드
	public static int method4(int... numbers) {
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum;
	}

}
