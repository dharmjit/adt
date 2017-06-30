package graphadt;

import java.util.Set;

public interface DirectedGraphInterface<V extends Vertex, E extends Edge<V>> extends GraphInterface<V, E> {
	Set<E> getInbound(V v);

	Set<E> getOutbound(V v);

}
