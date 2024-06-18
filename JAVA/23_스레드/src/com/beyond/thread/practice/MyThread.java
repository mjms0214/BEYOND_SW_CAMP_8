package com.beyond.thread.practice;

/*
 * 스레드 생성 방법
 *  Thread 클래스를 상속 받는 방법
 * 1. 
 */
public class MyThread extends Thread {

	@Override
	public void run() {
		// 작업하고자 하는 코드를 작성한다.
		for (int i = 0; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + "[" + i + "]");
		}
	}

}
