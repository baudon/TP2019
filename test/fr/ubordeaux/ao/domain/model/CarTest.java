package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import fr.ubordeaux.ao.domain.exception.EntryException;

public class CarTest {

	Make citroen = new Make("Citroen");
	Model c2 = new Model("C2", citroen);
	Model c3 = new Model("C3", citroen);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test(expected = EntryException.class)
	public final void testCar() {
		Car ca = new Car(1, c2);
		Car cb = new Car(1, c3);
	}
	
	@Test
	public final void testCar2() {
		Set<Car> cars = new HashSet<Car>();
		Car ca = new Car(1, c2);
		Car cb = new Car(1, c2);
		cars.add(ca);
		cars.add(cb);
		assertEquals(cars.size(), 1);
	}


	
	public final void testId() {
		Car c = new Car(1, c2);
		assertEquals(c.id(), 1);
	}
		
	public final void testModel() {
		Car c = new Car(1, c2);
		assertEquals(c.model(), c2);
	}
}
