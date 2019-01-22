package DesignPatterns.Decorator.ClassesCombination;

public abstract class Dessert {

	private double price;
	private String type;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
