package com.beyond.tree;

import com.beyond.tree.practice.BinarySearchTree;

public class Application {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		
		// insert() 테스트
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		// order() 테스트
		tree.order();
		System.out.println();
		
		// search() 테스트
		System.out.println(tree.search(40));
		System.out.println(tree.search(90));
		System.out.println();
		
		// delete() 테스트
		tree.delete(20);
		tree.order();
		System.out.println();
		
		tree.delete(30);
		tree.order();
		System.out.println();
		
		tree.delete(50);
		tree.order();
		System.out.println();
		
	}
}
