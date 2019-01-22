package DesignPatterns.Decorator;

public class Chocolate extends DessertDecorator {
	
	public Chocolate(Dessert dessert) {
		super(dessert);
	}
	
	@Override
	public String getType() {
		return dessert.getType() + ", chocolate";
	}

	@Override
	public double getPrice() {
		return dessert.getPrice() + 0.2;
	}
}
