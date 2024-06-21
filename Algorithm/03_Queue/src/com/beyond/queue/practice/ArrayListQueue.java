package com.beyond.queue.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue<T> implements Queue<T> {

	private int front; // 큐의 첫 번째 데이터가 저장되어 있는 배열의 인덱스
	private int rear; // 큐의 마지막 데이터가 저장되어 있는 배열의 인덱스
	private int maxSize; // 큐의 최대 크기
	private int size; // 큐에 저장된 데이터의 수
	private List<T> values;
	
	
	public ArrayListQueue(int maxSize) {
		this.maxSize = maxSize;
		this.values = new ArrayList<>();
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}

	@Override
	public void enqueue(T value) {
		if (this.size == this.maxSize) {
			throw new RuntimeException("큐가 가득 찼습니다.");
		}
		
		if (rear == maxSize) {
			rear = -1;
		}
		
		values.add(value);
		size++;
		
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}

	@Override
	public T dequeue() {
		if(isEmpty()) {
			throw new RuntimeException("큐가 비어 있습니다.");
		}
		T value = (T) values.get(front++);
		
		if (front == maxSize) {
			front = 0;
		}
		
		size--;
		
		return value;
	}

	@Override
	public T peek() {
		if(isEmpty()) {
			throw new RuntimeException("큐가 비어 있습니다.");
		}
		return (T) values.get(front);
	}

	@Override
	public boolean contains(T value) {
		boolean result = false;
		int front = this.front;
		
		for (int i = 0; i < size; i++) {
			if(values.get(front).equals(value)) {
				result = true;
				break;
			}
			front = (front + 1) % maxSize;
		} 
		
		
		return result;
	}

	@Override
	public String toString() {
		int front = this.front;
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for (int i = 0; i < size; i++) {
			sb.append(values.get(front) + ", ");
			front  = (front + 1)% maxSize;
		}
		
		if(sb.lastIndexOf(",") != -1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");
		} else {
			sb.append("]");
		}
		
		
		return sb.toString();
	}

	
}
