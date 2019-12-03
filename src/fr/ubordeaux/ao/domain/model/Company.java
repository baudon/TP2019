package fr.ubordeaux.ao.domain.model;

public class Company {

	private String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public String name() {
		return name;
	}
	
	public boolean equals(Object o) {
		if (! (o instanceof Company))
			return false;
		Company ow = (Company) o;
		return ow.name.equals(name);
	}
}
