package fr.ubordeaux.ao.domain.model;

public class Constructor {

	private String name;
	
	public Constructor(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	
	public boolean equals(Object o) {
		if (! (o instanceof Constructor)) 
			return false;
		Constructor m = (Constructor) o;
		return m.name.equals(name);
	}
	
	public int hashCode() {
		return name.hashCode();
	}
}
