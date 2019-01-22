package DesignPatterns.Decorator.ClassesCombination;

import junit.framework.TestCase;

public class AppTest extends TestCase {
	
	public void testPrice() {
		Dessert dessert = new ChantillyAndChocolateCrepe();
		assertEquals(2.20, dessert.getPrice());
	}

}
