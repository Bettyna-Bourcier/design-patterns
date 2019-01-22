package DesignPatterns.Decorator.ClassesCombination;

public class ChocolateWaffle extends Waffle {

	public ChocolateWaffle() {
		super();
		setPrice(getPrice() + 0.2);
		setType(getType() + "chocolate");
	}
	
}
