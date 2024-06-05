package com.beyond.operator.practice;

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

}
