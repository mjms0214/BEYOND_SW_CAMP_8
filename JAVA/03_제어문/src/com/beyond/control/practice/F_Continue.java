package com.beyond.control.practice;

public class F_Continue {
	/*
	 * continue 문
	 * 	[표현법]
	 * 		반복문(조건식) {
	 * 			[continue;]
	 * 		}
	 */
	
	// 구구단(2 ~ 9단)을 출력
	// 단, 홀수단을 빼고 출력
	public void method1() {
		for (int i = 2; i <= 9; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.printf("==== %d단 ====\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
