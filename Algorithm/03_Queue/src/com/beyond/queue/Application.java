package com.beyond.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.beyond.queue.practice.ArrayListQueue;
import com.beyond.queue.practice.ArrayQueue;
import com.beyond.queue.practice.LinkedQueue;
import com.beyond.queue.practice.Queue;

public class Application {

	public static void main(String[] args) {
//		// 자바에서 제공하는 Queue 테스트
//		Queue<String> queue = new ConcurrentLinkedQueue<>();
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		// add() 테스트
//		queue.add("딸기");
//		queue.add("사과");
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		// poll() 테스트
//		System.out.println(queue.poll());
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		queue.add("바나나");
//		
//		// peek() 테스트
//		System.out.println(queue.peek());
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		// contains() 테스트
//		System.out.println(queue.contains("딸기"));
//		System.out.println(queue.contains("사과"));
//		System.out.println();
		
//		// ArrayQueue 구현 및 테스트
//		Queue<String> queue = new ArrayQueue<>(5);
//
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		// enqueue() 테스트
//		queue.enqueue("딸기");
//		queue.enqueue("포도");
//		queue.enqueue("사과");
//		queue.enqueue("복숭아");
//		queue.enqueue("오렌지");
////		queue.enqueue("키위");
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		// dequeue() 테스트
//		System.out.println(queue.dequeue());
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		queue.enqueue("바나나");
//
////		System.out.println(queue);
////		System.out.println(queue.size());
////		System.out.println(queue.isEmpty());
////		System.out.println();
////		
////		System.out.println(queue.dequeue());
////		
////		System.out.println(queue);
////		System.out.println(queue.size());
////		System.out.println(queue.isEmpty());
////		System.out.println();
//
////		queue.enqueue("레몬");
////		
////		System.out.println(queue);
////		System.out.println(queue.size());
////		System.out.println(queue.isEmpty());
////		System.out.println();
//		
////		System.out.println(queue.dequeue());
////		System.out.println(queue.dequeue());
////		System.out.println(queue.dequeue());
////		System.out.println(queue.dequeue());
////		System.out.println(queue.dequeue());
////		System.out.println(queue.dequeue());
//		
//		// peek() 테스트
//		System.out.println(queue.peek());
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		// contains() 테스트
//		System.out.println(queue.contains("딸기"));
//		System.out.println(queue.contains("사과"));
//		System.out.println();
		
//		// LinkedQueue 구현 및 테스트
//		Queue<String> queue = new LinkedQueue<>();
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		queue.enqueue("딸기");
//		queue.enqueue("사과");
////		queue.enqueue("포도");
////		queue.enqueue("복숭아");
////		queue.enqueue("오렌지");
////		queue.enqueue("키위");
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		queue.enqueue("바나나");
//
//		System.out.println(queue.dequeue());
////		System.out.println(queue.dequeue());
////		System.out.println(queue.dequeue());
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//
//		System.out.println(queue.peek());
//		
//		System.out.println(queue);
//		System.out.println(queue.size());
//		System.out.println(queue.isEmpty());
//		System.out.println();
//		
//		// contains() 테스트
//		System.out.println(queue.contains("딸기"));
//		System.out.println(queue.contains("사과"));
//		System.out.println();
		
		// ArrayListQueue 구현 및 테스트
		Queue<String> queue = new ArrayListQueue<>(5);
		
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println();
		
		queue.enqueue("딸기");
		queue.enqueue("사과");
//		queue.enqueue("포도");
//		queue.enqueue("복숭아");
//		queue.enqueue("오렌지");
//		queue.enqueue("키위");
		
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println();
		
		queue.enqueue("바나나");
		
		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
//		System.out.println(queue.dequeue());
		
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println();
		
		System.out.println(queue.peek());
		
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println();
		
		// contains() 테스트
		System.out.println(queue.contains("딸기"));
		System.out.println(queue.contains("사과"));
		System.out.println();
	}

}
