package DesignPatterns.Factory;

import java.util.List;

public class App {

	public static void main( String[] args )
    {
		ClothesFactory factory = new ClothesFactory();
		
		List<Garment> clothes = factory.getClothesDependingOnTemperature(25);
		
		for(Garment garment : clothes) {
			System.out.println("Garment color : " + garment.getColor());
		}
		
		List<Garment> clothes2 = factory.getClothesDependingOnTemperature(18);
		
		for(Garment garment : clothes2) {
			System.out.println("Garment color : " + garment.getColor());
		}		
    }
}
