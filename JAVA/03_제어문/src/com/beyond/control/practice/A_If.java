package com.beyond.control.practice;

import java.util.Scanner;

public class A_If {
	/*
	 * if 문
	 * 	[표현법]
	 * 		if(조건식) {
	 * 			실행 코드..
	 * 		} else if(조건식) {
	 * 			실행 코드..		
	 * 		} [else {
	 * 			실행 코드..
	 * 		}]
	 */
	
	// 사용자에게 입력받은 정수값이 홀수인지 짝수인지 판별하기
	public void method1() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 > ");
		number = scanner.nextInt();
		
		if ((number % 2) == 0) {
			System.out.printf("%d는 짝수이다.\n", number);
		} else {
			System.out.printf("%d는 홀수이다.\n", number);
		}
		
		scanner.close();
	}
	
	// 사용자에게 이름을 받아서 "홍길동"이 맞는지 확인하기
	public void method2() {
		String name = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 입력 > ");
		name = scanner.nextLine();
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		// 리터럴로 작성한 값이므로 가르키는 주소값(상수풀 공간에 생성된 주소값)이 같다.
		System.out.println(str1 == str2); 
		System.out.println("홍길동" == "홍길동");
		// 새로운 객체로 생성되었으므로 주소값이 다르다.
		System.out.println("홍길동" == new String("홍길동"));
		System.out.println("홍길동" == name);
		System.out.println("홍길동".equals("홍길동"));
		System.out.println("홍길동".equals(name));
		
//		if ("홍길동".equals(name)) {
		if (name != null && name.equals("홍길동")) {
			System.out.printf("%s은(는) 홍길동 본인이다.", name);
		} else {
			System.out.printf("%s은(는) 홍길동이 본인이 아니다.", name);
		}
		
		scanner.close();
	}

	// 사용자로부터 알파벳 하나를 입력받아 대문자인지 소문자인지 확인 후 출력
	public void method3() {
		char alphabet = '\u0000'; // 코드 값은 16진수
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("알파벳 입력 > ");
		alphabet = scanner.nextLine().charAt(0);
		
		if (alphabet >= 'A' && alphabet <= 'Z') {
			System.out.printf("%c은(는) 알파벳 대문자이다.", alphabet);
		} else if (alphabet >= 'a' && alphabet <= 'z') {
			System.out.printf("%c은(는) 알파벳 소문자이다.", alphabet);
		} else {
			System.out.printf("%c은(는) 알파벳이 아닙니다.", alphabet);
		}
		
		scanner.close();
	}

	public void practice() {
		int score = 0;
		char grade = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수(0~100) 입력 > ");
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("당신의 점수는 %d점이고 등급은 %c입니다.", score, grade);
		
		scanner.close();
	}
}
