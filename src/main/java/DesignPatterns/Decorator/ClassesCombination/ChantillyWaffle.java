package DesignPatterns.Decorator.ClassesCombination;

public class ChantillyWaffle extends Waffle {

	public ChantillyWaffle() {
		super();
		setPrice(getPrice() + 0.5);
		setType(getType() + "chantilly");
	}
	
}
