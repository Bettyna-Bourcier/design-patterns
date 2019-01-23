package DesignPatterns.Decorator;

import DesignPatterns.Decorator.ClassesCombination.ChantillyAndChocolateCrepe;
import DesignPatterns.Decorator.ClassesCombination.ChantillyWaffle;
import DesignPatterns.Decorator.ClassesCombination.Dessert;

public class App {
	public static void main( String[] args ) throws Exception
    {
		System.out.println("Classes combination");
		Dessert dessert = new ChantillyWaffle();
		System.out.println("Type dessert : " + dessert.getType() + "; prix dessert : " + dessert.getPrice());
		
		Dessert dessert2 = new ChantillyAndChocolateCrepe();
		System.out.println("Type dessert : " + dessert2.getType() + "; prix dessert : " + dessert2.getPrice());
    
		System.out.println("Decorator");
		DesignPatterns.Decorator.Dessert dessert3 = new Waffle();
		dessert3 = new Chantilly(dessert3);
		System.out.println("Type dessert : " + dessert3.getType() + "; prix dessert : " + dessert3.getPrice());
		DesignPatterns.Decorator.Dessert dessert4 = 
				new Chocolate(
					new Chantilly(
						new Crepe()
					)
				);
		System.out.println("Type dessert : " + dessert4.getType() + "; prix dessert : " + dessert4.getPrice());
		
		DessertFactory factory = new DessertFactory();
		DesignPatterns.Decorator.Dessert dessert5 = factory.addDecorator(new Chantilly(new Crepe()), "CHANTILLY");
		
    }
}
