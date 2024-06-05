package com.beyond.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	/*
	 * 비교 연산자
	 *   크기 비교 (>, <, >=, <=)
	 *   동등 비교 (==, !=)
	 */
	public void method1() {
		int number1 = 10; 
		int number2 = 25;
		boolean result = false;

//		result = number1 == number2;
//		result = number1 != number2;
//		result = number1 > number2;
//		result = number1 < number2;
//		result = 'A' == 65 ; // 65 == 65
//		result = 3 == 3.0 ; // 3.0 == 3.0

//		단, 예외가 있다.
//		부동 소수점 방식은 오차가 생길 수 있기 때문에 
//		대부분 비교 연산에서는 정수 타입을 사용한다.
//		result = 3.0 == 3.0F ; 
		result = 0.1 == 0.1F ; 

		System.out.println("result : " + result);

	}
	
	public void method2() {
		/*
		 * 산술 연산 + 비교 연산
		 * 사용자에게 입력받은 값은 짝수인지, 홀수인지 판단하기
		 */
		int number = 0;
		boolean result = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력해 주세요. > ");
		number = scanner.nextInt();
		
		result = ((number % 2) == 0);
		
		System.out.printf("%d는 짝수인가요? %b", number, result);
		
		scanner.close();
	}

}
