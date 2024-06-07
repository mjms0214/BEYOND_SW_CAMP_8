package com.beyond.control.practice;

import java.util.Scanner;

public class C_For {
	/*
	 * for 문
	 * 	[표현법]
	 * 		for(초기식; 조건식; 증감식) {
	 * 			실행 코드..
	 * 		}
	 */
	
	// 1부터 10까지의 정수들의 합계를 출력
	public void method1() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}
		
		System.out.println("합계: " + sum);
	}
	
	// 1부터 랜덤값(1 ~ 10)까지의 합계를 출력
	public void method2() {
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 사용해서 랜덤값을 발생시킬 수 있다.
		 * random() 메소드 호출 시 0.0 ~ 0.9999... 사이의 랜덤값을 발생시킨다. (0.0 <= 랜덤값 < 1.0)
		 */
//		double random = Math.random(); // 0.0 ~ 0.999999...
//		double random = Math.random() * 10; // 0.0 ~ 9.99999...
//		double random = Math.random() * 10 + 1; // 0.0 ~ 10.99999...
		int random = (int)(Math.random() * 10 + 1); // 1 ~ 10
		
		System.out.printf("1 ~ 10 사이의 랜덤값 : %d\n", random);
		
		int sum = 0;
		for (int i = 1; i <= random ; i++) {
			sum += i;
		}
		
		System.out.printf("1부터 %d까지의 합: %d", random, sum);
	}

	// 2단 ~ 9단까지 출력
	public void method3() {
		for (int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
	
	/*
	 * 실습 문제
	 * 1부터 사용자가 입력한 수까지의 합계를 구하시오.
	 * 
	 * 예시)
	 * 정수 > 10
	 * 
	 * 총 합계 : 55
	 */
	public void practice1() {
		int num = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 > ");
		num = scanner.nextInt();
		
		for (int i = 0; i <= num; i++) {
			sum += i;
		}
		
		System.out.printf("총 합계 : %d", sum);
		
		scanner.close();
	}
}
