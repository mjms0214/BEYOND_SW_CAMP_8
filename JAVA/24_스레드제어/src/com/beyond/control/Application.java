package com.beyond.control;

import com.beyond.control.practice.Consumer;
import com.beyond.control.practice.Producer;
import com.beyond.control.practice.Storage;

public class Application {
	public static void main(String[] args) {
		Storage storage = new Storage();
		Thread producer = new Producer(storage);
		Thread consumer = new Thread(new Consumer(storage));
		
		
		producer.start();
		consumer.start();
	}
}
