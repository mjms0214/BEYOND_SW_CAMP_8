package com.beyond.staticmember.practice;

public class A_StaticField {
	// 정적 필드
	// 프로그램 실행과 동시에 메모리가 생성되고 객체들이 공유하면서 사용할 목적으로 선언한다.
	// 정적 필드는 프로그램이 실행될 때 해당 클래스가 로드되면서 메모리에 생성된다.
	// 정적 필드는 프로그램이 종료될 때 소멸된다.
	public static int number = 2;
	
	private static String message = "A_StaticField에 선언된 정적 필드입니다.";

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		A_StaticField.message = message;
	}
	
}
