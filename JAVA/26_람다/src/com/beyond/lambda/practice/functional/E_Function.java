package com.beyond.lambda.practice.functional;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;

public class E_Function {
	/*
	 * Function
	 * - Function 표준 함수적 인터페이스는 매개값과 리턴 값이 있는 apply() 추상 메소드를 가지고 있다.
	 * - apply() 추상 메소드는 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역할을 한다.
	 */
	public void method1() {
//		Function<String, Integer> function = str -> Integer.parseInt(str);
		Function<String, Integer> function = Integer::parseInt;
		
		System.out.println(function.apply("23456"));
		
		BiFunction<Integer, Double, String> biFunction = (Integer i, Double d) -> {
			return String.format("%d + %.1f = %.1f\n", i, d, (i+d));
		};
		
		System.out.println(biFunction.apply(10, 3.15));
		
	}

}
