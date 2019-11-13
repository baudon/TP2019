package fr.ubordeaux.ao.domain.model;

import java.util.Objects;

public class Model {

	private String name;
	private Make make;
	
	public Model(String name, Make make) {
		this.name = name;
		this.make = make;
	}
	
	public String name() {
		return name;
	}
	
	public Make make() {
		return make;
	}
	
	public boolean equals(Object o) {
		if (! (o instanceof Model)) 
			return false;
		Model m = (Model) o;
		return m.name.equals(name) && m.make.equals(make);
	}
	
	public int hashCode() {
		return Objects.hash(name, make);
	}
}
