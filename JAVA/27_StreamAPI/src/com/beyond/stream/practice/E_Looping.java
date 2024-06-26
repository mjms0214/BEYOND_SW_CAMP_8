package com.beyond.stream.practice;

import java.util.Arrays;

public class E_Looping {
	/*
	 * 반복
	 * 	- 요소 전체를 반복하는 역할을 한다.
	 * 	- peek()
	 * 		중간 처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기 위해 사용한다.
	 * 
	 * 	- forEach()
	 * 		최종 처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기 위해 사용한다.
	 */
	
	public void method1() {
		int sum = 0;
		int[] numbers = {1,2,3,4,5};
		
		// 최종 처리 메소드를 호출한 이후에는 다른 최종 처리 메소드를 호출할 수 없다.
		sum = Arrays.stream(numbers)
					.filter( number -> number %2 == 0)
					.peek(number -> System.out.println(number))
//					.forEach((int number) -> {
//						System.out.println(number);
//					})
					.sum();
		
		System.out.println("sum: " + sum);
		System.out.println();
		
		// 중간 처리 메소드는 최종 처리 메소드가 호출되어야 동작한다.
		Arrays.stream(numbers)
			  .filter(number -> number % 2 == 0)
			  .peek(number -> System.out.println(number));

		Arrays.stream(numbers)
		.filter(number -> number % 2 == 0)
		.forEach(number -> System.out.println(number));
	}
}
