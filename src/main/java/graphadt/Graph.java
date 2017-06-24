package graphadt;

import java.util.Set;

public interface Graph<V extends Vertex, E extends Edge<V>> {
	Set<V> getVertices();

	Set<V> getVertices(E e);

	Set<E> getEdges();

	Set<E> getEdges(V v);

	void addVertex(V v);

	void addEdge(E e);

	void removeVertex(V v);

	void removeEdge(E e);

}
