package com.beyond.graph;

import com.beyond.graph.practice.ListGraph;
import com.beyond.graph.practice.MatrixGraph;

public class Application {

	public static void main(String[] args) {
		// 인접 행렬(배열) 테스트
		MatrixGraph matrixGraph = new MatrixGraph(4);

		// addEdge() 테스트
		matrixGraph.addEdge(0,1,30);
		matrixGraph.addEdge(0,2,20);
		matrixGraph.addEdge(1,2,100);
		matrixGraph.addEdge(2,3,200);
		
		System.out.println(matrixGraph);
		
		// removeEdge() 테스트
		matrixGraph.removeEdge(0,1);
		
		System.out.println(matrixGraph);
		
		// 인접 리스트 테스트
		ListGraph listGraph = new ListGraph(4);
		
		// addEdge() 테스트
		listGraph.addEdge(0,1,30);
		listGraph.addEdge(0,2,20);
		
		System.out.println(listGraph);
		
		// removeEdge() 테스트
		listGraph.removeEdge(0,1);
		listGraph.removeEdge(0,2);
		
		System.out.println(listGraph);
		
		listGraph.addEdge(0,1,30);
		listGraph.addEdge(0,2,40);
		listGraph.addEdge(1,2,50);
		listGraph.addEdge(2,0,60);
		listGraph.addEdge(2,3,70);
		listGraph.addEdge(3,3,80);
		
		System.out.println(listGraph);
		
		// 깊이 우선 탐색(시작 꼭짓점은 2)
		listGraph.depthFirstSearch(2);
		
		System.out.println();
		
		// 너비 우선 탐색(시작 꼭짓점은 2)
		listGraph.breadthFirstSearch(2);
		
	
		
	}

}
