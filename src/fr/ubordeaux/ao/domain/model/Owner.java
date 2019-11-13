package fr.ubordeaux.ao.domain.model;

public class Owner {

	private String name;
	
	public Owner(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	
	public boolean equals(Object o) {
		if (! (o instanceof Owner))
			return false;
		Owner ow = (Owner) o;
		return ow.name.equals(name);
	}
	
	public int hashCode() {
		return name.hashCode();
	}
}
