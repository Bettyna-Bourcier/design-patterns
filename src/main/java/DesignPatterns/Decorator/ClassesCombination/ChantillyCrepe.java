package DesignPatterns.Decorator.ClassesCombination;

public class ChantillyCrepe extends Crepe {

	public ChantillyCrepe() {
		super();
		setPrice(getPrice() + 0.5);
		setType(getType() + "chantilly");
	}
	
}
