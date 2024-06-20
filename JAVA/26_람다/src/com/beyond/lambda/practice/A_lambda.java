package com.beyond.lambda.practice;

public class A_lambda {
	public void method1() {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("익명 구현 객체를 사용한 Thread 생성");
			}
		};
		
		runnable = () -> {
			System.out.println("람다식을 사용한 Thread 생성");
		};
		
		runnable = () -> System.out.println("람다식을 사용한 Thread 생성2");

		Thread thread = new Thread(runnable);
		
		thread.start();
	}
}
