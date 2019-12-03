package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ModelTest {

	Constructor airbus = new Constructor("Airbus");
		
	@Test
	public final void test() {
		Model m1 = new Model("A320", airbus);
		Model m2 = new Model("A320", airbus);
		assertEquals(m1, m2);
	}	
}
