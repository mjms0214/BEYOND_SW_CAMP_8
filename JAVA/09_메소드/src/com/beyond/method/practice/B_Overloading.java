package com.beyond.method.practice;

public class B_Overloading {
	public void test() {
		
	}
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/*
	 * 매개변수의 이름이 다르다고 오버로딩이 적용되지 않는다.
	 * 매개변수 이름과 상관없이 자료형의 개수와 순서가 같아서 에러가 발생한다.
	 */
//	public void test(int c, int d) {
//		
//	}
	
	/*
	 * 접근 제한자가 다르다고 오버로딩이 적용되지 않는다.
	 * 접근 제한자와 상관없이 잘형의 개수와 순서가 같아서 에러가 발생한다.
	 */
//	private void test(int a,int b) {
//		
//	}
	
	/*
	 * 반환형이 다르다고 오버로딩이 적용되지 않는다.
	 * 반환형과 상관없이 자료형의 개수와 순서가 같아서 에러가 발생한다.
	 */
//	public int test(int a, int b) {
//		
//	}

}
