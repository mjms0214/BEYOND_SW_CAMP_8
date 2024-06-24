package com.beyond.hash.practice;

import java.util.LinkedList;

public class HashTable<K, V> {
	private int maxSize;
	private LinkedList<HashNode<K, V>>[] buckets;
	
	@SuppressWarnings("unchecked")
	public HashTable(int maxSize) {

//		if (this.maxSize <= 0) {
//			throw new RuntimeException("잘못된 크기 지정 Size: " + maxSize);
//		}
		
		this.maxSize = maxSize;
		this.buckets = new LinkedList[this.maxSize];
		
		for (int i = 0; i < this.buckets.length; i++) {
			this.buckets[i] = new LinkedList<>();
		}
		
	}
	
	public void put(K key, V value){
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if (node.key.equals(key)) {
				node.value = value;
				return;
			}
		}
		
		buckets[index].add(new HashNode<>(key, value));
	}
	
	public V get(K key) {
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if (node.key.equals(key)) {
				return node.value;
			}
		}
		
		return null;
	}
	
	public V remove(K key) {
		V value = null;
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if (node.key.equals(key)) {
				
				value = node.value;
				buckets[index].remove(node);
				
				break;
			}
		}
		
		return value;
	}
	
//	public boolean contains(V value) {
//		
//		for (LinkedList<HashNode<K, V>> list : buckets) {
//			for (HashNode<K, V> node : list) {
//				if (node.value.equals(value)) {
//					return true;
//				}
//			}			
//		}
//		return false;
//	}
	
	public boolean contains(K key) {
		boolean result = false;
		int index = this.hash(key);
		
		for (HashNode<K, V> node : buckets[index]) {
			if (node.key.equals(key)) {
				result = true;
				break;
			}
		}			

		return result;
	}
	
	public int size() {
		int sum = 0;
		
		for (int i = 0; i < this.buckets.length; i++) {
			sum += this.buckets[i].size();			
		}
		return sum;
	}
	
	public boolean isEmpty() {
		boolean result = true;
		
		for (LinkedList<HashNode<K, V>> list : buckets) {
			if (list.size() != 0) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	private int hash(K key) {
//		System.out.println(key);
//		System.out.println(key.hashCode());
//		System.out.println(key.hashCode() % this.maxSize);
//		System.out.println();
		
		return Math.abs(key.hashCode() % this.maxSize);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < this.buckets.length; i ++) {
			LinkedList<HashNode<K, V>> bucket = this.buckets[i];
			
			sb.append(i).append(" : ").append(bucket).append(", ").append("\n");
		}
		
		sb.replace(sb.lastIndexOf(","), sb.length(), "");
		
		return sb.toString();
	}

	private static class HashNode<K, V> {
		private K key;
		private V value;
		

		private HashNode(K key, V value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "{key=" + key + ", value=" + value + "}";
		}
		
		
	}
}
