package com.beyond.control.practice;

public class Storage {
	private int product;
	
	// 객체의 상태를 저장하고 흐름을 제어하기 위한 필드(플래그 변수)
	private boolean empty = true;
	
	public synchronized void getProduct() {
		while (empty) {
			try {
				wait(); // 객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
				
		System.out.printf("소비자가 %d번 상품을 소비하였습니다.\n", this.product);
		
		this.empty = true;
		
		notify();
	}
	
	public synchronized void setProduct(int product) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.product = product;
		this.empty = false;
		
		System.out.printf("생산자가 %d번 상품을 생산하였습니다.\n", this.product);
		
		notify(); // wait()에 의해서 일시 정지된 스레드 중 한 개를 실행 대기 상태롤 만든다.
	}
}
