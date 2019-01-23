package DesignPatterns.Decorator;

public class Chantilly extends DessertDecorator {

	public Chantilly(Dessert dessert) throws Exception {
		super(dessert);
	/*	
	 * business rules in constructor
	 * if (dessert.getType().contains("chantilly")) {
			throw new Exception("double chantilly is not possible");
		} */
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
