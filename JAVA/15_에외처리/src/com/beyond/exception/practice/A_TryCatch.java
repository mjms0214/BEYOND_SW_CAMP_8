package com.beyond.exception.practice;

public class A_TryCatch {

	public void method1() {
		
		
		try {
			
			// 예외가 발생할 가능성이 있는 코드
//			int result = 10/0;
			
			throw new NullPointerException();
			
//			String str = null;
//			str.charAt(0);
//			
//			System.out.println(result);

		} catch (NullPointerException e) {
			
			// try 에서 발생한 예외를 처리하는 블
			System.out.println("NullPointerException이 발생하였습니다.");
			e.printStackTrace();
			
		} catch (ArithmeticException | ClassCastException e) {
			
			System.out.println("ArithmeticException 또는 ClassCastException이 발생하였습니다.");
			e.printStackTrace();
			
		} catch (Exception e) {	
			e.printStackTrace();
		} finally {
			// 예외 발생 여부와 상관없이 무조건 수행된다.
			System.out.println("finally 블록 실행");
		}
	}
	
}
