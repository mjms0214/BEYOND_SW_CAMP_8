package com.beyond.graph.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListGraph {
	private int numOfVertices;
	private List<List<Edge>> list;
	
	
	public ListGraph(int numOfVertices) {
		this.numOfVertices = numOfVertices;
		this.list = new LinkedList<>();
		
		for (int i = 0; i < this.numOfVertices; i++) {
			list.add(new LinkedList<>());
		}
	}
	
	public void addEdge(int src, int dest, int weight) {
		list.get(src).add(new Edge(dest, weight));
		
		// 그래프가 방향이 없는 경우
//		list.get(dest).add(new Vertex(src, weight));
	}
	
	public void removeEdge(int src, int dest) {
		List<Edge> vertex = list.get(src);
		
		for (Edge edge : vertex) {
			if (edge.vertex == dest) {
				vertex.remove(edge);
				
				break;
			}
		}
		
	}
	
	public void depthFirstSearch(int vertex) {
		boolean[] visited = new boolean[this.numOfVertices];
		
		this.depthFirstSearch(vertex, visited);
		
	}


	private void depthFirstSearch(int vertex, boolean[] visited) {
		System.out.print(vertex + " " );
		
		visited[vertex] = true;
		
		 for (Edge edge : list.get(vertex)) {
			 if (!visited[edge.vertex]) {
				 depthFirstSearch(edge.vertex, visited);
			 }
		 }
	}
	
	public void breadthFirstSearch(int vertex) {
		boolean[] visited = new boolean[this.numOfVertices];
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		queue.add(vertex);
		
		while (!queue.isEmpty()) {
			vertex = queue.poll();
			
			System.out.print(vertex + " ");
			
			visited[vertex] = true;
			
			for (Edge edge : list.get(vertex)) {
				if (!visited[edge.vertex]) {
					queue.add(edge.vertex);
				}
			}
		}
	}
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < list.size(); i++) {
			for (Edge edge : list.get(i)) {
				sb.append(String.format("Vertex %d -> Vertex %d (weight : %d)\n", i, edge.vertex, edge.weight));	
			}
			
		}
		
		return sb.toString();
	}


	private static class Edge {
		private int vertex;
		private int weight;
		
		public Edge(int vertex, int weight) {
			this.vertex = vertex;
			this.weight = weight;
		}
	}

}
