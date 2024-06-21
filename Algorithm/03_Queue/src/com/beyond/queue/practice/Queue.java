package com.beyond.queue.practice;

public interface Queue<T> {
	void enqueue(T value);
	
	int size();
	
	boolean isEmpty();

	T dequeue();

	T peek();
	
	boolean contains(T value);
}
