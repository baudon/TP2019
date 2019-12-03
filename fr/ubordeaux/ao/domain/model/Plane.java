package fr.ubordeaux.ao.domain.model;

public class Plane {

	private int id;
	private Model model;
	
	public Plane(int id, Model model) {
		this.id = id;
		this.model = model;
	}
	
	public int id() {
		return id;
	}
	
	public Model model() {
		return model;
	}
	
	public boolean equals(Object o) {
		if (! (o instanceof Plane)) 
			return false;
		Plane c = (Plane) o;
		return c.id == id;
	}
	
	public int hashCode() {
		return id;
	}
}
