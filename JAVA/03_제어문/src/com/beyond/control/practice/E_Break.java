package com.beyond.control.practice;

public class E_Break {
	/*
	 * break 문
	 * 	[표현법]
	 * 		반복문/switch(조건식) {
	 * 			...
	 * 			[break;]
	 * 		}
	 */
	
	/*
	 * 1부터 랜덤값(1 ~ 10)까지의 합계를 반복문을 통해서 계속 출력한다.
	 * 단, 랜덤값이 숫자 5가 나오면 프로그램을 종료한다.
	 * 
	 * 예시)
	 * 1부터 3까지의 합계 : 6
	 * 1부터 10까지의 합계 : 55
	 * ...
	 * 랜덤값이 5이므로 프로그램을 종료합니다.
	 */
	public void method1() {
		int sum = 0;
		int random = 0;
		
		for (;;) {
			sum = 0;
			random = (int)(Math.random() * 10 + 1);
			
			if (random == 5) {
				System.out.println("랜덤값이 5이므로 프로그램을 종료합니다.");
				break;
			}
			
			for (int i = 1; i <= random; i++ ) {
				sum += i;
			}
			System.out.printf("1부터 %d까지의 합계 : %d\n", random, sum);
		}
	}
}
