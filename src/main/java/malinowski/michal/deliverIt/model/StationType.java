package malinowski.michal.deliverIt.model;

public enum StationType {
	A (true), B (true), C (true), D (false), E (false), F (false), G (false), H (false), I (false);
	
	boolean multiple;
	
	StationType (boolean multiple) {
		this.multiple = multiple;
	}
}
