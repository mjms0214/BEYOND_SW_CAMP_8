package com.beyond.stream.practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

import javax.naming.spi.DirStateFactory.Result;

public class G_Aggregate {
	/*
	 * 집계
	 * 	- 최종 처리 기능으로 요소들의 개수, 합계, 평균값, 최대값, 최소값 등과 같이 하나의 값으로 산출하는 역할을 한다.
	 * 	- count()
	 * 	- sum()
	 * 	- average()
	 * 	- max()
	 * 	- min()
	 * 	- findFirst()
	 * 
	 * Optional 클래스
	 * 	- 스트림의 최종 결과 값을 저장하는 객체이다.
	 * 	- 단순히 값만 저장하는 것이 아니라, 값의 존재 여부를 확인하고 값이 존재하지 않을 경우 디폴트 값을 지정한다.
	 */
	public void method1() {
		int[] numbers = {1,2,3,4,5,6};
//		int[] numbers = {1,3,5};
		
		// 2의 배수의 개수
		long count = Arrays.stream(numbers).filter(value -> value % 2 == 0).count();
		System.out.println("2의 배수의 개수 : " + count);

		// 2의 배수의 합계
		long sum = Arrays.stream(numbers).filter(value -> value % 2 == 0).sum();
		System.out.println("2의 배수의 합 : " + sum);

		// 2의 배수의 평균
		OptionalDouble average = Arrays.stream(numbers).filter(value -> value % 2 == 0).average();
		
		// Optional 객체에 저장된 값을 가져온다.
//		System.out.println("2의 배수의 평균 : " + average.getAsDouble());

		// 값의 존재 여부를 확인하고 Optional 객체에서 값을 가져온다.
//		if (average.isPresent()) {
//			System.out.println("2의 배수의 평균 : " + average.getAsDouble());			
//		} else {
//			System.out.println("2의 배수의 평균 : 0");						
//		}
		
		// 집계 값을 처리하는 Consumer를 등록한다. (값이 존재해야 실행된다.)
//		average.ifPresent(d -> System.out.println(d));
		
		// get 메소드와 동일하게 저장되어 있는 값을 얻어오는 메소드로 값이 저장되어 있지 않을 경우 디폴트 값을 지정한다.
		System.out.println("2의 배수의 평균 : " + average.orElse(0.0));
		
		// 2의 배수의 최솟값
		OptionalInt min = Arrays.stream(numbers).filter(value -> value % 2 == 0).min();
		
		System.out.println("2의 배수의 최솟값 : " + min.orElse(0));

		// 2의 배수의 최댓값
		OptionalInt max = Arrays.stream(numbers).filter(value -> value % 2 == 0).max();
		
		System.out.println("2의 배수의 최댓값 : " + max.orElse(0));
		
		// 2의 배수의 첫 번째 요소
		OptionalInt first = Arrays.stream(numbers).filter(value -> value % 2 == 0).findFirst();
		
		System.out.println("2의 배수의 첫 번째 요소 : " + first.orElse(0));
		
		// 2의 배수의 곱
		Arrays.stream(numbers)
			  .filter(value -> value % 2 == 0)
			  .reduce((left, right) -> left * right )
			  .ifPresent(result -> System.out.println("2의 배수의 곱 : " + result));
		
	}
}
