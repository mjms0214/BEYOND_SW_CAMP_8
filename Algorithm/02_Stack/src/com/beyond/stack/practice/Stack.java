package com.beyond.stack.practice;

public interface Stack<T> {
	void push(T value);
	
	int size();
	
	boolean isEmpty();

	T pop();
	
	boolean contains(T value);

	T peek();
}
