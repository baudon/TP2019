package fr.ubordeaux.ao.domain.model;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class CompanyTest {
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public final void test() {
		Set<Company> companies = new HashSet<>();
		Company af = new Company("Air France");
		companies.add(af);
		Company af2 = new Company("Air France");
		assertTrue(companies.contains(af2));
	}	
}
