package DesignPatterns.Decorator;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	
	public void testPrice() throws Exception {
		Dessert dessert = new Crepe();
		dessert = new Chocolate(dessert);
		assertEquals(1.7, dessert.getPrice());
		
		dessert = new Chantilly(dessert);
		assertEquals(2.2, dessert.getPrice());
	}
	
	public void testMetierChantilly() {
		Dessert crepe = new Crepe();
		try {
			new Chantilly(new Chantilly(crepe));
			fail("should raise an exception");
		} catch(Exception e) {
			assertTrue(true);
		}
	}
	
	public void testMetierChocolat() {
		Dessert crepe = new Crepe();
		try {
			new Chocolate(new Chocolate(crepe));
			assertTrue(true);
			
		} catch(Exception e) {
			fail("should not raise an exception");
		}
	}

}
