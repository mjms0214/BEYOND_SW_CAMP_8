package com.beyond.abstractclass.practice;

public class BasketBall extends Sports{

	public BasketBall(int numberOfPlayers) {
		super(numberOfPlayers);
	}
	
	@Override
	public void rule() {
		System.out.printf("BasketBall의 선수의 수는 %d명, 공을 던져서 링에 넣어야한다.\n", super.numberOfPlayers);
	}

}
