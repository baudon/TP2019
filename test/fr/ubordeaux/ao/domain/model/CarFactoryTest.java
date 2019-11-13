package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.ubordeaux.ao.domain.exception.EntryException;

public class CarFactoryTest {

	Make citroen = new Make("Citroen");
	Model c2 = new Model("C2", citroen);

	@Before
	public void setUp() throws Exception {
	}

	@Test(expected = EntryException.class)
	public final void test() {
		CarFactory cf = new CarFactory();
		Car ca = cf.getCar(1, c2);
		Car cb = cf.getCar(1, c2);
	}

}
