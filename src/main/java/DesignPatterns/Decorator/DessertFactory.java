package DesignPatterns.Decorator;

public class DessertFactory {
	
	public Dessert addDecorator(Dessert dessert, String decorator) throws Exception {
		if (decorator.equals("CHOCOLATE")) {
			return new Chocolate(dessert);
		} else if (decorator.equals("CHANTILLY")) {
			if (dessert.getType().contains("chantilly")) {
				throw new Exception("double chantilly is not possible");
			}
			return new Chantilly(dessert);
		}
		throw new Exception("unknown decorator");
	}

}
