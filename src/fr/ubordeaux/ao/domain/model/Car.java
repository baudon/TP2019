package fr.ubordeaux.ao.domain.model;

public class Car {

	private int id;
	private Model model;
	
	public Car(int id, Model model) {
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
		if (! (o instanceof Car)) 
			return false;
		Car c = (Car) o;
		return c.id == id;
	}
}
