package DesignPatterns.Decorator.ClassesCombination;

public class ChantillyAndChocolateWaffle extends ChocolateWaffle {

	public ChantillyAndChocolateWaffle() {
		super();
		setPrice(getPrice() + 0.5);
		setType(getType() + "chantilly");
	}
	
}

