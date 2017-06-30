package graphadt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DirectedGraphImpl<V extends Vertex, E extends Edge<V>> extends GraphAbstract<V, E>
		implements DirectedGraphInterface<V, E> {

	private final Map<V, Set<E>> inbound = new HashMap<V, Set<E>>();

	public Set<E> getInbound(V v) {
		return inbound.get(v);
	}

	public Set<E> getOutbound(V v) {
		return getAdjacencyList().get(v);
	}

/*	@Override
	protected void decorateAddVertex(V v) {
		inbound.put(v, new HashSet<E>());

	}

	@Override
	protected void decorateRemoveVertex(V v) {
		inbound.remove(v);

	}

	@Override
	protected void decorateAddEdge(E e) {
		inbound.get(e.getTail()).add(e);

	}

	@Override
	protected void decorateRemoveEdge(E e) {
		inbound.get(e.getTail()).remove(e);

	}*/

}
