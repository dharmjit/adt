package graphadt;

import java.util.Set;

public interface DirectedGraph<V extends Vertex, E extends Edge<V>> extends Graph<V, E> {
	Set<E> getInbound(V v);

	Set<E> getOutbound(V v);

}
