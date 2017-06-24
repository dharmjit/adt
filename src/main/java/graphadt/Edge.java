package graphadt;

import java.util.Set;

public interface Edge<V extends Vertex> {

	String getLabel();

	void setLabel(String s);
	
	V getHead();
	
	V getTail();

}
