package graphadt;

import static java.util.Collections.unmodifiableSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class GraphAbs<V extends Vertex, E extends Edge<V>> implements Graph<V, E> {
	private final Map<V, Set<E>> adjacencyList = new HashMap<V, Set<E>>();
	private final Set<E> allEdges = new HashSet<E>();

	public Set<V> getVertices() {
		return adjacencyList.keySet();
	}

	public Set<E> getEdges() {
		return allEdges;
	}

	public Set<V> getVertices(E e) {
		Set<V> vertices = new HashSet<V>();
		vertices.add(e.getHead());
		vertices.add(e.getTail());
		return vertices;
	}

	public Set<E> getEdges(V v) {
		return adjacencyList.get(v);
	}

	public void addVertex(V v) {
		if (v == null) {
			// TODO
		}
		if (getAdjacencyList().containsKey(v)) {
			// TODO
		}
		getAdjacencyList().put(v, new HashSet<E>());
		// decorateAddVertex(v);
	}

	// protected abstract void decorateAddVertex(V v);

	public void removeVertex(V v) {
		if (v == null) {
			// TODO
		}
		if (!getAdjacencyList().containsKey(v)) {
			// TODO
		}
		getAdjacencyList().remove(v);
		// decorateRemoveVertex(v);
	}

	// protected abstract void decorateRemoveVertex(V v);

	public void addEdge(E e) {
		checkEdge(e);
		getEdges().add(e);
		getAdjacencyList().get(e.getHead()).add(e);
		// decorateAddEdge(e);
	}

	// protected abstract void decorateAddEdge(E e);

	public void removeEdge(E e) {
		checkEdge(e);
		getEdges().remove(e);
		getAdjacencyList().get(e.getHead()).remove(e);
		// decorateRemoveEdge(e);
	}

	// protected abstract void decorateRemoveEdge(E e);

	private void checkEdge(E e) {
		if (!getAdjacencyList().containsKey(e.getHead())) {
			// TODO
		}
		if (!getAdjacencyList().containsKey(e.getTail())) {
			// TODO
		}
	}

	protected Map<V, Set<E>> getAdjacencyList() {
		return adjacencyList;
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("Graph Representation - Adjacency List"+"\n");
		for(Entry<V, Set<E>> entry:getAdjacencyList().entrySet()){
			s.append(entry.getKey()+": "+entry.getValue()+"\n");
		}
		return s.toString();
	}

}
