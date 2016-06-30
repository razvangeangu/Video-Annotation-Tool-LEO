package application;

public class Annotation {
	
	// A label that hold the information about the annotation.
	private String label;
	private String fromTime;
	private String toTime;
	
	// Format of the annotation (ID, Sender, Type, Scope, Focus, Content, Target)
	private int ID;
	private String sender;
	private String type;
	private String scope;
	private String focus;
	private String content;
	private String target;
	
	
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

	public void setLabel(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
	/**
	 * A method to get the DSL form of the annotation.
	 * @return A string that represennts the DSL form of the annotation.
	 */
	public String getDSL() {
		
		return "from " + fromTime + " to " + toTime + " annotate(" + ID + "," + sender + "," + type + "," + scope + "," + focus + "," + content + "," + target + ")";
	}

}
