package com.googleprep.graphs.api;

import java.util.ArrayList;
import java.util.List;

public class UndirectedGraph {
	
	public Bag[] adj;
	public int marked[];
//	public UndirectedGraph(int v, Map<Integer,Integer> connections) {
//		adj = new Bag[v];
//		marked = new int[v];
//	}
//	
	public void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	
	public Iterable<Integer> getAdjecentVertices(int v) {
		return adj[v].elements;
	}

}

class Bag {
	
	public List<Integer> elements = new ArrayList<>();
	public Bag() { 
	}
	
	public void add(int e) {
		elements.add(e);
	}
	
}