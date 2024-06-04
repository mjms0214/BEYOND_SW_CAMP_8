package com.beyond.variable;

import com.beyond.variable.practice.A_Variable;

/*
 * 주석(Comment)
 * 	- 소스 코드와는 무관하고, 코드로 인식되지 않는다.
 *	- 주로 코드에 대한 설명을 작성할 때 사용한다.
 */
// 한 줄 주석

// 클래스 명은 자바 파일명과 동일해야 한다.
public class Application {

	// main 메소드는 프로그램의 시작점으로
	// java.exe가 Application.class를 실행시킬 때 제일 먼저 실행되는 메소드이다.
	public static void main(String[] args) {
		// 1) 실행할 메소드가 있는 클래스를 생성(new)한다.
		//   [표현법]
		//     클래스명 변수명 = new 클래스명();
		
		// 1-1) import 문을 사용하지 않고 클래스 생성
		// com.beyond.variable.practice.A_Variable variable = new com.beyond.variable.practice.A_Variable();

		// 1-2) import 문을 사용하여 클래스 생성
		A_Variable variable = new A_Variable();
		

		// 2) 생성한 클래스로 메소드 실행(호출)
		//	[표현법]
		//		변수명.메소드명()
		variable.variableTest();
	}

}
