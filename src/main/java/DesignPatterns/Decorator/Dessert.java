package DesignPatterns.Decorator;

public abstract class Dessert {

	private double price;
	private String type;
	
	public double getPrice() {
		return price;
	}
	protected void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	protected void setType(String type) {
		this.type = type;
	}
	
}
