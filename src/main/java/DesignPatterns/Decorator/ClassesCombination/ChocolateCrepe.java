package DesignPatterns.Decorator.ClassesCombination;

public class ChocolateCrepe extends Crepe {

	public ChocolateCrepe() {
		super();
		setPrice(getPrice() + 0.2);
		setType(getType() + "chocolate");
	}
	
}
