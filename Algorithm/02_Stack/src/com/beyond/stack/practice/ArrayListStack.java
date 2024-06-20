package com.beyond.stack.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStack<T> implements Stack<T> {
	
	private int top;
	private int maxSize;
	private List<T> values;
	
	public ArrayListStack(int maxSize) {
		this.top = -1;
		this.maxSize = maxSize;
		this.values = new ArrayList<>();
	}

	@Override
	public void push(T value) {
		if (top == maxSize -1) {
			throw new RuntimeException("스택이 가득 찼습니다.");
		} else {
			values.add(++top, value);
		}
		
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return (top == -1);
	}

	@Override
	public T pop() {
		if (this.isEmpty()) {
			throw new RuntimeException("스택이 비어 있습니다.");
		} else {
//			return values.remove(top--);
			return values.get(top--);
		}
	}

	@Override
	public boolean contains(T value) {
		boolean result = false;
		
		for (int i = 0; i <= top; i++) {
			if (values.get(i).equals(value)) {
				result = true;
				
				break;
			}
		}
		
		return result;
	}

	@Override
	public T peek() {
		if (this.isEmpty()) {
			throw new RuntimeException("스택이 비어 있습니다.");
		} else {
			return values.get(top);
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for (int i = 0; i <= top; i++) {
			sb .append(values.get(i) + ", ");
		}
		
		if (sb.lastIndexOf(",") != -1) {
			sb.replace(sb.lastIndexOf(","), sb.length(), "]");
		} else {
			sb.append("]");
		}
		
		return sb.toString();
	}
	
	

}
