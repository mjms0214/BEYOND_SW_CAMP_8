package com.beyond.lambda.practice.functional;

import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class D_Supplier {
	/*
	 * Supplier
	 * 	- Supplier 표준 함수적 인터페이스는 매개변수가 없고 리턴 값이 있는 get() 추상 메소드를 가진다.
	 * 	- get() 추상 메소드는 호출한 곳으로 데이터를 리턴(공급)하는 역할을 한다.
	 */
	public void method1() {
		Supplier<String> supplier = () -> {
			return "Supplier는 제네릭으로 지정된 타입의 객체를 리턴한다.";
		};
		
		System.out.println(supplier.get());
		
		BooleanSupplier bSupplier = () -> true;
		
		System.out.println(bSupplier.getAsBoolean());
	}
}
