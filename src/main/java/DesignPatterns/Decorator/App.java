package DesignPatterns.Decorator;

import DesignPatterns.Decorator.ClassesCombination.ChantillyAndChocolateCrepe;
import DesignPatterns.Decorator.ClassesCombination.ChantillyWaffle;
import DesignPatterns.Decorator.ClassesCombination.Dessert;

public class App {
	public static void main( String[] args )
    {
		Dessert dessert = new ChantillyWaffle();
		System.out.println("Type dessert : " + dessert.getType() + "; prix dessert : " + dessert.getPrice());
		
		Dessert dessert2 = new ChantillyAndChocolateCrepe();
		System.out.println("Type dessert : " + dessert2.getType() + "; prix dessert : " + dessert2.getPrice());
    }
}
