package graphadt;

import java.util.HashSet;
import java.util.Set;

public class BaseEdge implements Edge<Vertex> {
	private String label;
	private Vertex head;
	private Vertex tail;
	private Double weight;

	public BaseEdge(String label, Vertex head, Vertex tail, Double weight) {
		this.label = label;
		this.head = head;
		this.tail = tail;
		this.weight = weight;

	}

	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return "BaseEdge [label=" + label + ", head=" + head + ", tail=" + tail + ", weight=" + weight + "]";
	}

	public Set<Vertex> getVertices() {
		return new HashSet<Vertex>();

	}

	public void setLabel(String label) {
		this.label = label;

	}

	public Vertex getHead() {
		return head;
	}

	public Vertex getTail() {
		return tail;
	}

}
