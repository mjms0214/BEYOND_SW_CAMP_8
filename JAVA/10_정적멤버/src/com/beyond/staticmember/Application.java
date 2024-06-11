package com.beyond.staticmember;

import com.beyond.staticmember.practice.A_StaticField;
import com.beyond.staticmember.practice.B_StaticMethod;
import com.beyond.staticmember.practice.C_StaticFinalfield;

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
		System.out.println();
		
		// 3. 매개변수가 있고 반환값이 없는 정적 메소드 호출
		B_StaticMethod.method3(30);
		System.out.println();

		// 4. 매개변수	와 반환값이 있는 정적 메소드
		System.out.println(B_StaticMethod.method4());
		System.out.println(B_StaticMethod.method4(8, 9));
		System.out.println(B_StaticMethod.method4(10, 15, 20, 40));
		System.out.println();
		
		// final 필드 테스트
		C_StaticFinalfield staticFinalField1 = new C_StaticFinalfield("남자");
		C_StaticFinalfield staticFinalField2 = new C_StaticFinalfield("여자");
		
		System.out.println(staticFinalField1.getGender());
		System.out.println(staticFinalField2.getGender());
		System.out.println();
		
		// 상수(static final) 테스트
		System.out.println(C_StaticFinalfield.MAX_LEVEL);
		System.out.println(Math.PI);
		System.out.printf("byte의 표현 범위는 %d ~ %d 입니다.\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("int의 표현 범위는 %d ~ %d 입니다.\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("char의 표현 범위는 %d ~ %d 입니다.\n", (int)Character.MIN_VALUE, (int)Character.MAX_VALUE);
		
		// final 키워드로 인해서 값을 변경할 수 없다.
//		C_StaticFinalfield.MAX_LEVEL = 90;
//		Math.PI = 3.15;
	}

}
