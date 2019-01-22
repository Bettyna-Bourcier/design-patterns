package DesignPatterns.Decorator;

public abstract class DessertDecorator extends Dessert {
	
	Dessert dessert;
	
	public DessertDecorator(Dessert dessert) {
		this.dessert = dessert;
	}
	
	public abstract double getPrice();
	
	public abstract String getType();

}
