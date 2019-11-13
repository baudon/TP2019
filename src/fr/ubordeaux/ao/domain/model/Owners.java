package fr.ubordeaux.ao.domain.model;

import java.util.Set;

public interface Owners {

	/** Retourne l'ensemble des voitures du propriétaire o */
	public Set<Car> cars(Owner o);

	/**
	 * Rajoute la voiture c au propriétaire newOwner et l'enlève (si besoin) à son
	 * ancien propriétaire.
	 */
	public void changeOwner(Car c, Owner newOwner);

	/** Retourne le propriétaire de la voiture c. */
	public Owner owner(Car c);
}
