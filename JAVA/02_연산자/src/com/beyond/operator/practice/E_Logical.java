package com.beyond.operator.practice;

import java.util.Scanner;

public class E_Logical {
	/*
	 * 논리 연산자
	 * 	&&(AND, 논리곱)
	 * 		- 왼쪽, 오른쪽 피연산자 모두 true인 경우 참(true)
	 * 
	 * 	||(OR, 논리합)
	 * 		- 왼쪽, 오른쪽 피연산자 중에 하나라도 true인 경우 참(true) 
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인하기
		int number = 0;
		boolean result = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = scanner.nextInt();
		
		result = (number >= 1) && (number <= 100);
		
		System.out.printf("%d은(는) 1부터 100 사이의 값인가요? %b\n", number, result);
	}
	
	public void method2() {
		// Short Cut 연산 테스트
		int number = 10;
		boolean result = false;
		
		System.out.println("&& 연산 전의 number의 값 : " + number);
		
		// && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (number < 5) && (++number > 0);
//		result = (number < 5) & (++number > 0);
		
		System.out.println("result : " + result);
		System.out.println("&& 연산 후의 number의 값 : " + number);
		System.out.println();
		
		System.out.println("|| 연산 전의 number의 값 : " + number);
		
		// && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (number < 20) || (++number > 0);
//		result = (number < 20) | (++number > 0);
		
		System.out.println("result : " + result);
		System.out.println("|| 연산 후의 number의 값 : " + number);
	}

	/*
	 * 실습 문제
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 'A' ~ 'Z'까지 코드값으로 65 ~ 90 까지의 숫자로 나열되어 있따.
	 * 
	 * 예시)
	 * 문자 하나 입력 > f
	 * 사용자가 입력한 값이 대문자입니까? : false
	 */
	public void practice() {
		char alphabet = '\u0000';
		Scanner scanner = new Scanner(System.in);
		Boolean result = false;
		
		System.out.println("문자 하나 입력 > ");
		alphabet = scanner.nextLine().charAt(0);
		
//		result = (alphabet >= 65) && (alphabet <= 90);
		result = (alphabet >= 'A') && (alphabet <= 'Z');
		
//		System.out.printf("사용자가 입력한 값이 대문자입니까? %b", result);
		System.out.println("사용자가 입력한 값이 대문자입니까? " + result);
		
		
	}
}
