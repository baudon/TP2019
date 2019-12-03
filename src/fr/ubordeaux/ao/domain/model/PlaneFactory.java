package fr.ubordeaux.ao.domain.model;

import java.util.HashMap;
import java.util.Map;

import fr.ubordeaux.ao.domain.exception.EntryException;

public class PlaneFactory {
	private Map<Integer, Plane> map;

	public PlaneFactory() {
		map = new HashMap<>();
	}

	public Plane getPlane(int id, Model m) {
		if (map.containsKey(id)) {
			Plane c = map.get(id);
			if (c.model().equals(m))
				return c;
			else
				throw new EntryException("This id yet exists for another model !");
		} else {
			Plane c = new Plane(id, m);
			map.put(id, c);
			return c;
		}
	}
}
