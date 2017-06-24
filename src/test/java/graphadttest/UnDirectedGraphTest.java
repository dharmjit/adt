package graphadttest;

import graphadt.BaseEdge;
import graphadt.BaseVertex;
import graphadt.Edge;
import graphadt.UnDirectedGraphImpl;
import graphadt.Vertex;

public class UnDirectedGraphTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnDirectedGraphImpl<Vertex, Edge<Vertex>> ug = new UnDirectedGraphImpl<Vertex, Edge<Vertex>>();
		Vertex v1 = new BaseVertex("A");
		Vertex v2 = new BaseVertex("B");
		Edge<Vertex> E = new BaseEdge("AB", v1, v2, 0.0);
		ug.addVertex(v1);
		ug.addVertex(v2);
		ug.addEdge(E);
		System.out.println(ug);
	}


}
