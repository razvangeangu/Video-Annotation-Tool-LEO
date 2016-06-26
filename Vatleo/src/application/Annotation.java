package application;

public class Annotation {
	
	// A label that hold the information about the annotation.
	private String label;
	private String fromTime;
	private String toTime;
	
	/**
	 * A constructor for a simple annotation.
	 */
	public Annotation() {
		
		label = "NO LABEL";
		fromTime = "0";
		toTime = "0";
	}
	
	/**
	 * A constructor for an annotation with a label.
	 * @param label The label to be set for the annotation.
	 */
	public Annotation(String label) {
		
		this.label = label;
		fromTime = "0";
		toTime = "0";
	}
	
	/**
	 * Overriding the toString method in order to show the label.
	 */
	@Override
	public String toString() {
		
		return label;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

}
