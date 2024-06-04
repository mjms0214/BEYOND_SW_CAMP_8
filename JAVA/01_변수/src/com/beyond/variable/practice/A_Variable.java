package com.beyond.variable.practice;

public class A_Variable {
	/*
	 * 변수의 선언
	 * 변수명: 카멜 표기법
	 * 	[표현법]
	 * 		자료형 변수명;
	 *
	 */
	public void variableTest() {
		/*
		 * 기본 타: 실제 값이 들어간다.
		 */
		// 논리형(boolean)
		boolean isTrue;
		
		// 정수형
		byte bNum; //(-128 ~ 127)
		short sNum; //-32,768 ~ 32,767
		int iNum; //-2,147,483,648 ~ 2,147,483,647
		long lNum; //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		
		// 실수형
		float fNum; //±1.4E-45 ~ 3.4E38
		double dNum;
		
		// 문자형
//		char ch;
//		char ch = 'A';
//		char ch = 0;
//		char ch = '\u0000';
//		char ch = -90; //0 ~ 65,535 (유니코드)
//		char ch = 35870;
		char ch = 'a';
		
		System.out.println("ch: " + ch);
		System.out.println();
		
		// 문자열
//		String name; // 문자열을 가리킬 수 있는 참조 변수를 선언
//		String name = "";
//		String name = "홍길동";
//		String name = new String("홍길동");
		String name = null; // 참조형 변수에만 null 값을 담을 수 있다.
		
		System.out.println("name: " + name);
		
		// 지역 변수를 생성한 후 초기화가 되지 않은 경우 에러가 발생한다.
//		System.out.println(isTrue);
		
		isTrue = false; // 선언 후 초기화
//		isTrue = 1; // 에러 발생
		
		System.out.println(isTrue);
		System.out.println("is True: "+isTrue);
		System.out.println();
		
		// 에러 발생
//		bNum = 128;
		bNum = 127;
//		sNum = 70000;
		sNum = 32000;
		iNum = 234567991;
		// 리터럴은 기본적으로 정수값이므로 int형 범위를 넘어가면 사용할 수 없다.
//		lNum = 922337203685477580;
		// long 타입의 리터럴은 숫자 뒤에 L 또는 l을 입력해야 한다.
		lNum = 922337203685477580L;
		
		System.out.println("bNum: " + bNum);
		System.out.println("sNum: " + sNum);
		System.out.println("iNum: " + iNum);
		System.out.println("lNum: " + lNum);
		System.out.println();
		
		// float 타입의 리터럴에서 숫자 뒤에 F 또는 f을 입력해야 한다.
		fNum = 3.141593F;
//		dNum = 3.14D;
		dNum = 3.14;
		
		System.out.println("fNum: " + fNum);
		System.out.println("dNum: " + dNum);
		
		// 변수의 명명 규칙
		// 1) 대소문자 구분
		int number;
//		String number; // 자료형이 달라도 변수명이 같으면 에러 발생
		int NUMBER;
		int numBer;
		
		// 2) 숫자로 시작하면 안 된다.
//		int 1age;
		int a1g2e3;
		
		// 3) 특수문자는 _, $만 사용이 가능하다.
		int _age;
		int ag_e_;
		int $age;
		int a$ge$;
//		int %age;
//		int age*;
		
		// 4) 예악어를 사용하면 안된다.
//		int double;
//		int class;
//		int public;
//		int void;
		
	}
}
