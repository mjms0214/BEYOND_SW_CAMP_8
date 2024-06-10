package com.beyond.control.practice;

import java.util.Scanner;

public class G_LoopPractice {
	/*
	 * 실습 문제 1
	 * 사용자가 입력한 단을 출력하시오. 
	 * 
	 * 예시 1)
	 *    단 수(2 ~ 9)를 입력해 주세요. > 3
	 *    3 X 1 = 3
	 *    ...
	 *    3 X 9 = 27
	 *    
	 * 예시 2)
	 *    단 수(2 ~ 9)를 입력해 주세요. > 12
	 *    2 ~ 9 사이의 양수를 입력하여야 합니다.
	 */
	public void practice1() {
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("단 수(2 ~ 9)를 입력해 주세요. > ");
		num = scanner.nextInt();
		
		if (num < 2 || num > 9) {
			System.out.println("2 ~ 9 사이의 양수를 입력하여야 합니다.");
			scanner.close();
			
			return;
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}
		
		scanner.close();
	}
	
	/*
	 * 실습 문제 2
	 * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
	 * 
	 * 예시)
	 *   1***
	 *   *2**
	 *   **3*
	 *   ***4
	 */
	public void practice2() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if(i == j) {
					System.out.printf("%d", i);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * 실습 문제 3
	 * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
	 * 
	 * 예시)
	 *   *
	 *   **
	 *   ***
	 *   ****
	 *   *****
	 */
	public void practice3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 * 실습 문제 4
	 * 
	 * 반복적으로 두 정수를 입력받고 연산자 기호(+, -, *, /)를 입력 받아서 계산을 출력하라
	 * 단, 연산자 기호를 잘못 입력하는 경우 "연산자를 잘못 입력하셨습니다." 출력하고 프로그램을 종료한다.
	 * 
	 * 예시)
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+, -, *, /) > +
	 *   
	 *   3 + 4 = 7
	 *   
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+, -, *, /) > a
	 *   
	 *   연산자를 잘못 입력하셨습니다.
	 */
	public void practice4() {
		int num1 = 0;
		int num2 = 0;
		char operator = '\u0000';
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("첫 번째 수 > ");
			num1 = scanner.nextInt();
			
			System.out.print("두 번째 수 > ");
			num2 = scanner.nextInt();
			
			scanner.nextLine(); // 버퍼 제거
			
			System.out.print("연산자 입력(+, -, *, /) > ");
			operator = scanner.nextLine().charAt(0);
			
			switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("연산자를 잘못 입력하셨습니다.");
				scanner.close();
				
				return;
			}
			
			System.out.printf("\n%d %c %d = %d\n\n", num1, operator, num2, result);
		}
		
	}
	
	/*
	 * 실습 문제 5
	 * 사용자가 "안녕하세요."라고 입력을 하면 아래와 같이 출력 되도록 코드를 작성하라.
	 * '안'
	 * '녕'
	 * '하'
	 * '세'
	 * '요'
	 * '.'
	 */
	public void practice5() {
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문장 입력 > ");
		str = scanner.nextLine();

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
