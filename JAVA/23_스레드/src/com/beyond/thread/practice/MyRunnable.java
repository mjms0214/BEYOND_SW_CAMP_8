package com.beyond.thread.practice;

/*
 *  스레드 생성 방법
 *  
 *  2. Runnable 인터페이스를 구현하는 방법
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// 작업하고자 하는 코드를 작성한다.
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "[" + i + "]");
		}
	}
	

}
