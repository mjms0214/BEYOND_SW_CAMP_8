package com.beyond.thread;

import com.beyond.thread.practice.MyRunnable;
import com.beyond.thread.practice.MyThread;

public class Application {

	public static void main(String[] args) {
		System.out.println("메인 스레드 실행");
		
		MyThread thread1 = new MyThread();
		
		thread1.setName("thread1");
//		thread1.setPriority(10);
		thread1.setPriority(Thread.MAX_PRIORITY);
//		thread1.run(); // main
		thread1.start(); // Thread0
		
		Thread thread2 = new Thread(new MyRunnable());
		
		thread2.setName("thread2");
//		thread2.setPriority(1);
		thread2.setPriority(Thread.MIN_PRIORITY);		
//		thread2.run(); // main
		thread2.start(); // Thread1
		
		// 익명 구현 객체
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// 작업하고자 하는 코드를 작성한다.
				for (int i = 0; i <= 100; i++) {
					System.out.println(Thread.currentThread().getName() + "[" + i + "]");
				}
			}
			
		});
		
		thread3.setName("thread3");
		thread3.start(); // method3
		
		// 람다식
		Thread thread4 = new Thread(() -> {
			// 작업하고자 하는 코드를 작성한다.
			for (int i = 0; i <= 100; i++) {
				System.out.println(Thread.currentThread().getName() + "[" + i + "]");
			}
		});
		
		thread4.setName("thread4");
		/*
		 * 데몬 스레드
		 * 	- 보조적인 역할을 수행하는 수레드이다.
		 * 	- 다른 스레드가 종료되면 데몬 스레드는 강제로 종료된다.
		 */
		thread4.setDaemon(true); // 데몬 스레드 지정
		thread4.start();

		try {
			/*
			 *  join() 메소드
			 *  	- join()을 호출한 스레드는 해당 스레드가 종료될 때까지 기다렸다가 스레드가 종료되면
			 *  	  join()을 호출한 스레드를 다시 실행한다.
			 */
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료");

	}

}
