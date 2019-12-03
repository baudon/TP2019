package fr.ubordeaux.ao.domain.model;

import java.util.Set;

public interface Fleets {

	/** Retourne l'ensemble des avions de la companie c */
	public Set<Plane> planes(Company c);

	/**
	 * Rajoute l'avion p à la compagnie company et l'enlève (si besoin) à son
	 * ancienne compagnie.
	 */
	public void setCompagny(Plane p, Company company);

	/** Retourne la compagnie à laquelle appartient l'avion p. */
	public Company owner(Plane p);
}
