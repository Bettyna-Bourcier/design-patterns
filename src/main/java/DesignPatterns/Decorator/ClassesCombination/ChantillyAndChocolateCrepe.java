package DesignPatterns.Decorator.ClassesCombination;

public class ChantillyAndChocolateCrepe extends ChocolateCrepe {

	public ChantillyAndChocolateCrepe() {
		super();
		setPrice(getPrice() + 0.5);
		setType(getType() + "chantilly");
	}
	
}
