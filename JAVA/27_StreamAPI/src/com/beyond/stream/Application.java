package com.beyond.stream;

import com.beyond.stream.practice.B_Filtering;
import com.beyond.stream.practice.C_Sorted;
import com.beyond.stream.practice.D_Mapping;
import com.beyond.stream.practice.E_Looping;
import com.beyond.stream.practice.F_Match;
import com.beyond.stream.practice.G_Aggregate;
import com.beyond.stream.practice.H_Collect;

public class Application {

	/*
	 * Stream API
	 * 	- 스트림은 자바 8부터 추가된 기능으로 컬렉션(배열)의 저장된 요소들을 하나씩 참조해서
	 *    람다식으로 처리할 수 있도록 해주는 반복자이다.
	 *  - 스트림은 람다식으로 요소 처리 코드를 제공할 수 있고, 내부 반복자를 사용해서
     *    병렬 처리, 중간 처리, 최종 처리 작업을 수행할 수 있다.
     *    (1) 중간 처리: 반복, 매핑(타입 변환), 필터링, 정렬 등을 수행한다.
     *    (2) 최종 처리: 반복, 카운팅, 평균, 총합 등의 집계 처리를 수행한다.
     *  - 중간 처리 메소드와 최종 처리 메소드를 구분하는 방법 리턴 타입을 보면 구분이 가능하다.
     *  	- 리턴 타입이 Stream이면 중간 처리 메소드이다.
     *  	- 리턴 타입이 기본 타입이거나, Optional 객체라면 최종 처리 메소드이다.
	 */
	public static void main(String[] args) {
		
		// 스트림 생성
//		new A_Create().method1();
//		new A_Create().method2();
//		new A_Create().method3();
		
		// 중간 처리 메소드
//		new B_Filtering().method1();
//		new B_Filtering().method2();
		
//		new C_Sorted().method1();
//		new C_Sorted().method2();
		
//		new D_Mapping().method1();
//		new D_Mapping().method2();
		
//		new E_Looping().method1();
		
//		new F_Match().method1();
//		new F_Match().method2();
		
//		new G_Aggregate().method1();
		
		new H_Collect().method1();
	}

}
