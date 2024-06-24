package com.beyond.lambda.practice.functional;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class F_Operator {
	/*
	 * Operator
	 * 	- Operator 표준 함수적 인터페이스는 매개값과 리턴 값이 있는 apply() 추상 메소드를 가지고 있다.
	 * 	- apply() 추상 메소드는 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다.
	 */
	public void method1() {
		IntBinaryOperator intBinaryOperator = (int a, int b) -> {
			return a*b;
		};
		
		System.out.println(intBinaryOperator.applyAsInt(10, 20));
		
		IntUnaryOperator intUnaryOperator = a -> a*a*a;
		
		System.out.println(intUnaryOperator.applyAsInt(2));
		
		BinaryOperator<String> binaryOperator = (str1, str2) -> str1.length() >= str2.length() ? str1 : str2;
		
		System.out.println(binaryOperator.apply("안녕하세요. 홍길동입니다.", "만나서 반갑습니다."));
	}
}
