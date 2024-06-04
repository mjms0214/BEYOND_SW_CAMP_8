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

	/*
	 * 자동 형 변환
	 * 	- 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환한다.
	 */
	public void autoCasting() {
		byte bNum = 10;
		short sNum = 12;
		int iNum = sNum; // short -> int 자동 형 변환된다.
		long lNum = iNum; // int -> long 자동 형 변환된다.
		// float 타입이 long 타입보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형 변환이 가능하다.
		float fNum = lNum; // long -> float 자동 형 변환된다.
		double dNum = fNum; // float -> double 자동 형 변환된다.
		
		System.out.println("bNum: " + bNum);
		System.out.println("sNum: " + sNum);
		System.out.println("iNum: " + iNum);
		System.out.println("lNum: " + lNum);
		System.out.println("fNum: " + fNum);
		System.out.println("dNum: " + dNum);
		System.out.println();
		
		char ch = '김';
		iNum = ch;
		
		System.out.println("ch: " + ch);
		System.out.println("iNum: " + iNum);
		System.out.println();
		
		double result = 12 + 3.3; // 12.0 + 3.3 = 15.3
		// byte, short 타입의 데이터는 연산 시 무조건 int 타입으로 변환 후 처리된다.
		int result2 = bNum + sNum;
		long result3 = 30 + 30; // 30 + 30 = 60, 60을 long 타입으로 변환 후 대입(60L)
		long result4 = 30 + 30L; // 30L + 30L = 60L
		
		System.out.println("result: " + result);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println();
		
	}
	
	/*
	 * 강제 형 변환
	 * 	[표현법]
	 * 		(자료형) 데이터;
	 * - 데이터 손실이 발생할 수 있다.
	 */
	public void casting() {
		double dNum = 4.234567893456789;
		float fNum = (float)dNum;
		int iNum = (int)fNum;
		
		System.out.println("dNum: " + dNum);
		System.out.println("fNum: " + fNum);
		System.out.println("iNum: " + iNum);
		System.out.println((byte)290);
		System.out.println();
		
//		int sum = (int)(iNum + dNum); // 4.0 + 4.234567893456789 = 8.234567893456789 -> 8
		int sum = iNum + (int)dNum; // 4 + 4 = 8
		
		System.out.println("sum: " + sum);
		System.out.println();
	}

	public void practice() {
		
		/*
		 * 실습 문제
		 * 홍길동 국어 60점, 영어 70점, 수학 66점을 받았다.
		 * 이 학생의 총점과 평균을 출력하세요.
		 * 
		 * 예시)
		 * 국어 점수 : 60점
		 * 영어 점수 : 70점
		 * 수학 점수 : 66점
		 * 
		 * 총점 : 196점
		 * 평균 : 65
		 */
		
		// final: 한번 초기화 되고 나면 값을 수정할 수 없다.
		final int k_score = 60;
//		k_score = 14; // 에
		int e_score = 70;
		int m_score = 66;
		
		int sum = k_score + e_score + m_score;
//		double avg = sum / 3; //65.0
		double avg = sum / 3.0; //65.333333333
		
		System.out.printf("국어 점수 : %d점\n", k_score);
		System.out.printf("영어 점수 : %d점\n", e_score);
		System.out.printf("수학 점수 : %d점\n", m_score);
//		System.out.println("국어 점수 : " + k_score + "점");
//		System.out.println("영어 점수 : " + e_score + "점");
//		System.out.println("수학 점수 : " + m_score + "점");
		System.out.println();
		System.out.println("총점 : " + sum + "점");
		System.out.println("평균: " + avg + "점");
//		System.out.printf("평균: %.2f점\n", avg);
				
	}
	
}
