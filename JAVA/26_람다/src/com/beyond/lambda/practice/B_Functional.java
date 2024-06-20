package com.beyond.lambda.practice;

import com.beyond.lambda.practice.functional.A_FunctionalInterface;
import com.beyond.lambda.practice.functional.B_FunctionalInterface;
import com.beyond.lambda.practice.functional.C_FunctionalInterface;

public class B_Functional {
	private int number = 100;

	public void method1() {
		A_FunctionalInterface fi;
		
		fi = () -> {
			System.out.println("매개변수와 반환값이 없는 람다식 1");
		};
		
		fi.method();

		// 실행문이 한 줄 이라면 중괄호({}) 생략 가능
		fi = () -> System.out.println("매개변수와 반환값이 없는 람다식 2");
		
		fi.method();
	}

	public void method2() {
		B_FunctionalInterface fi;
		
		fi = (int a) -> {
			System.out.println(a * a);
		};
		
		fi.method(5);

//		fi = (int a) -> System.out.println(a * a);
//		
//		fi.method(10);
	}
	
	public void method3() {
		int result = 0;
		C_FunctionalInterface fi;
		
		fi = (int a, int b) -> {
			return a + b;
		};
		
		fi = (a, b) -> a + b;

		result = fi.method(10, 20);
		
		System.out.println("result : " + result);
	
	}

	// 람다식에서 필드와 지역 변수 사용하기
	public void method4(int arg) {
		final int number = 200;
		
		A_FunctionalInterface fi;
		
		// 람다식에서 지역변수(매개변수)를 이용할 때는 final, effectively final 이어야 한다.
		// - 지역변수는 람다식에서 읽는 것은 허용되지만, 람다식 내부에서 또는 외부에서 변경할 수 없다.
		// - 초기화된 이후에 값이 한 번도 변경되지 않는 변수를 effectively final이라고 한다.
//		arg = 600;
//		number = 300;
//		this.number = 500;
		
		// 람다식에서 사용되는 this는 람다식을 실행하는 객체의 참조이다.
		fi = () -> {
//			arg = 600;
//			number = 300;
//			this.number = 500;
			
			System.out.println(arg);
			System.out.println(number);
			System.out.println(this.number);
		};
		
		fi.method();
		System.out.println();
		
		// 익명 구현 객체에서 사용되는 this 는 익명 구현 객체의 참조이다.
		fi = new A_FunctionalInterface() {
//			private int number = 1000;
			
			@Override
			public void method() {
//				arg = 600;
//				number = 300;
//				this.number = 500;
				
				System.out.println(arg);
				System.out.println(number);
//				System.out.println(this.number);
			}
		};
		
		fi.method();
	}
}
