package DesignPatterns.Decorator;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	
	public void testPrice() {
		Dessert dessert = new Crepe();
		dessert = new Chocolate(dessert);
		assertEquals(1.7, dessert.getPrice());
		
		dessert = new Chantilly(dessert);
		assertEquals(2.2, dessert.getPrice());
	}

}
