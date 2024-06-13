package com.beyond.api.practice;

public class A_Wrapper {
	/*
	 * Wrapper 클래스
	 * 	- 기본 자료형을 객체로 포장해 주는 클래스이다.
	 * 	- 기본 자료형을 Wrapper 클래스로 포장해주는 것을 Boxing 이라고 한다.
	 * 	- Wrapper 클래스를 기본 자료형으로 변경해주는 것을 Unboxing 이라고 한다.
	 */
	
	public void method1() {
		// Boxing (기본 타입 -> Wrapper 객체)
		// 1. Wrapper 클래스로 객체를 생성하는 방법
		
		Integer integer = new Integer(10);
		Double double1 = new Double(3.14);
		Double double2 = new Double(3.14);
		
		System.out.println(integer);
		System.out.println(double1);
		System.out.println(double2.toString());
		System.out.println();
		
		System.out.println(double1 == double2);
		System.out.println(double1.equals(double2));
		System.out.println();
		
		// 2. 정적 메소드를 통해서 생성하는 방법
		Integer integer2 = Integer.valueOf(3);
		Double double3 = Double.valueOf(3.14);
		Double double4 = Double.valueOf("3.14");
		
		System.out.println(integer2);
		System.out.println(double3);
		System.out.println(double4);
		System.out.println(double3.equals(double4));
		System.out.println();
		
		// 3. Auto Boxing
		Integer integer3 = 5;
		Double double5 = 1.2345678;
		Double double6 = 1.2345678;
		
		System.out.println(integer3);
		System.out.println(double5);
		System.out.println(double6);
		System.out.println(double5 == double6);
		System.out.println(double5.equals(double6));
		System.out.println();
		
		// Unboxing (Wrapper 객체 -> 기본 타입)
		// 1. Wrapper 객체의 메소드를 이용하는 방법
		int iNum1 = integer.intValue();
		int iNum2 = integer2.intValue();
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		System.out.println(iNum1 + iNum2);
		System.out.println();
		
		// 2. Auto Unboxing
		double dNum1 = double1;
		double dNum2 = double2;
		
		System.out.println(dNum1);
		System.out.println(dNum2);
		System.out.println(dNum1 + dNum2);
		System.out.println();
		
		System.out.println(integer2 + integer3);
		System.out.println(double4 + double5 + integer);
		System.out.println();
		
	}
}
