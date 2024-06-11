package com.beyond.staticmember;

import com.beyond.staticmember.practice.A_StaticField;
import com.beyond.staticmember.practice.B_StaticMethod;

class Application {

	public static void main(String[] args) {
		
		// 정적 필드 테스트
		System.out.println(A_StaticField.number);
		
		A_StaticField staticField1 = new A_StaticField();
		A_StaticField staticField2 = new A_StaticField();
		
		System.out.println(staticField1.number);
		System.out.println(staticField2.number);
		System.out.println();
		
		A_StaticField.number++;
		
		System.out.println(staticField1.number);
		System.out.println(staticField2.number);
		System.out.println();
		
		System.out.println(A_StaticField.getMessage());
		A_StaticField.setMessage("메세지 변경");
		System.out.println(A_StaticField.getMessage());
		System.out.println();
		
		// 정적 메소드 테스트
		// 1. 매개변수와 반환값이 없는 정적 메소드 호출
		B_StaticMethod.method1();
		B_StaticMethod.method1();
		B_StaticMethod.method1();
		System.out.println();
		
		// 2. 매개변수가 없고 반환값이 있는 정적 메소드 호출
		System.out.println(B_StaticMethod.method2());

	}

}
