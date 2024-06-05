package com.beyond.variable.practice;

import java.util.Scanner;

public class C_KeyBoardInput {
	public void inputByScanner() {
		/*
		 * Scanner 클래스
		 *   - 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스이다.
		 */
		int age = 0;
		float height = 0;
		String name = null;
		char gender = '\u0000';
		Scanner scanner = new Scanner(System.in);

		System.out.println("당신의 이름은 무엇입니까?");
		name = scanner.nextLine();

		System.out.println("당신의 나이는 몇 살입니까?");
		age = scanner.nextInt();

		System.out.println("당신의 키는 몇 입니까?(소수점 첫째 자리까지 입력하세요.)");
		height = scanner.nextFloat();

		System.out.println("당신의 성별은 무엇입니까? (남/여)");

		// 버퍼에 남아있는 '엔터'를 빼주기 위해서 scanner.nextLine() 메소드를 한 번 더 호출한다.
		scanner.nextLine();

		gender = scanner.nextLine().charAt(0);

		System.out.printf("당신의 이름은 %s이고 나이는 %d세, 키는 %.1fcm, 성별은 %c 입니다.", name, age, height, gender);
	}



}
