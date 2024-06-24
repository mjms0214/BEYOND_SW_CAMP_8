package com.beyond.lambda.practice.functional;

import java.sql.SQLClientInfoException;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class G_Predicate {
	/*
	 * Predicate
	 * 	- Predicate 표준 함수적 인터페이스는 매개변수와 boolean 값을 리턴하는 test() 추상 메소드를 가지고 있다.
	 * 	- test() 추상 메소드 매개값을 조사해서 true/false를 리턴하는 역할을 한다.
	 */
	public void method1() {
		Predicate<String> predicate = (s) -> {
			return s.equals("홍길동");
		};
		
		System.out.println(predicate.test("이몽룡"));
		System.out.println(predicate.test("홍길동"));
		
		BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
		
		System.out.println(biPredicate.test("홍길동", "이몽룡"));
		
		
	}
}
