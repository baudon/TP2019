package fr.ubordeaux.ao.domain.model;

public class Make {

	private String name;
	
	public Make(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	
	public boolean equals(Object o) {
		if (! (o instanceof Make)) 
			return false;
		Make m = (Make) o;
		return m.name.equals(name);
	}
	
	public int hashCode() {
		return name.hashCode();
	}
}
