package com.beyond.hash;

import com.beyond.hash.practice.HashTable;

public class Application {

	public static void main(String[] args) {
		HashTable<String, String> hashTable = new HashTable<>(3);
		
		System.out.println(hashTable);
		System.out.println("size: " + hashTable.size());
		System.out.println("isEmpty: " + hashTable.isEmpty());
		System.out.println();
		
		hashTable.put("strawberry", "딸기");
		hashTable.put("apple", "사과");
		hashTable.put("grape", "포도");
		hashTable.put("banana", "바나나");
		hashTable.put("banana", "몽키바나나");
		hashTable.put("peach", "복숭아");
		hashTable.put("orange", "오렌지");
//		hashTable.put("key6", "수박");
//		hashTable.put("key7", "망고");
		
		System.out.println(hashTable);
		System.out.println("size: " + hashTable.size());
		System.out.println();
		
		// get() 테스트
		System.out.println(hashTable.get("banana"));
		System.out.println(hashTable.get("melon"));
		System.out.println();
		
		// remove() 테스트
		System.out.println(hashTable.remove("banana"));
		System.out.println(hashTable.remove("strawberry"));
		System.out.println(hashTable.remove("melon"));
		System.out.println(hashTable);
		System.out.println();
		
		// contains() 테스트
//		System.out.println(hashTable.contains("사과"));
//		System.out.println(hashTable.contains("딸기"));
//		System.out.println();
		System.out.println(hashTable.contains("apple"));
		System.out.println(hashTable.contains("banana"));
		System.out.println();
		
		
		// size() 테스트
		System.out.println(hashTable);
		System.out.println("size: " + hashTable.size());
		System.out.println();
		
		// isEmpty() 테스트
		System.out.println("isEmpty: " + hashTable.isEmpty());
		System.out.println();
		

	}

}
