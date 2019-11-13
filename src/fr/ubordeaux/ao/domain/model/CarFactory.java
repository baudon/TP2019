package fr.ubordeaux.ao.domain.model;

import java.util.HashMap;
import java.util.Map;

import fr.ubordeaux.ao.domain.exception.EntryException;

public class CarFactory {
	private Map<Integer, Car> map;

	public CarFactory() {
		map = new HashMap<>();
	}

	public Car getCar(int id, Model m) {
		if (map.containsKey(id)) {
			Car c = map.get(id);
			if (c.model().equals(m))
				return c;
			else
				throw new EntryException("This id yet exists for another model !");
		} else {
			Car c = new Car(id, m);
			map.put(id, c);
			return c;
		}
	}
	
	
}
