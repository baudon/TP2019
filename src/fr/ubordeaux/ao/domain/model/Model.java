package fr.ubordeaux.ao.domain.model;

import java.util.Objects;

public class Model {

	private String name;
	private Constructor constructor;
	
	public Model(String name, Constructor constructor) {
		this.name = name;
		this.constructor = constructor;
	}
	
	public String name() {
		return name;
	}
	
	public Constructor constructor() {
		return constructor;
	}
	
	public boolean equals(Model m) {
		return m.name.equals(name) && m.constructor.equals(constructor);
	}
	
	public int hashCode() {
		return Objects.hash(name, constructor);
	}
}
