package DesignPatterns.Decorator;

public class Chantilly extends DessertDecorator {
	
	/*public Chantilly(Dessert dessert) {
		super(dessert);
		setPrice(dessert.getPrice() + 0.5); 
	}*/

	public Chantilly(Dessert dessert) {
		super(dessert);
	}
	
	@Override
	public String getType() {
		return dessert.getType() + ", chantilly";
	}

	@Override
	public double getPrice() {
		return dessert.getPrice() + 0.5;
	}

}
