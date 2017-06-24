package graphadt;

public class BaseVertex implements Vertex {

	private String label;
	
	public BaseVertex(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return getLabel();
	}

}
