package com.beyond.stream.practice;

import java.util.Arrays;
import java.util.List;

public class D_Mapping {
	/*
	 * 매핑
	 * 	- 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 역할을 한다.
	 */
	public void method1() {
		List<Student> students = Arrays.asList(
				new Student("홍길동", 24, "남자", 80, 50),
				new Student("성춘향", 20, "여자", 80, 80),
				new Student("이몽룡", 26, "남자", 80, 80),
				new Student("김영희", 20, "여자", 90, 90)
		);
		
//		students.stream()
//				.map((Student student) -> {
//					return student.getName();
//				})
//				.forEach(name -> System.out.println(name));

		students.stream()
		.map((Student student) -> {
			return student.getName();
		})
		.forEach(System.out::println);
		
		System.out.println();
		
		double avg = students.stream()
//							 .mapToInt((Student student) -> {
//								 return student.getMath();
//							 })
//							 .mapToInt(student -> student.getMath())
							 .mapToInt(Student::getMath)
							 .average()
							 .getAsDouble();
		
		System.out.println("수학 점수의 평균 : " + avg);
		System.out.println();
		
		List<String> list = Arrays.asList("Java21 Lambda", "StreamAPI Filtering Mapping");
		
		list.stream().forEach(System.out::println);
		
		System.out.println();
		
		list.stream()
			.flatMap(str -> Arrays.stream( str.split(" ")))
			.forEach(System.out::println);
		
	
	}

	public void method2() {
		int[] iArray = {1,2,3,4,5};
		
		Arrays.stream(iArray)
//			  .asLongStream()
			  .asDoubleStream()
//			  .boxed()
			  .forEach(System.out::println);
	}
}
