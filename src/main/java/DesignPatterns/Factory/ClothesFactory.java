package DesignPatterns.Factory;

import java.util.ArrayList;
import java.util.List;

public class ClothesFactory {

	public List<Garment> getClothesDependingOnTemperature(int temperature) {
		
		List<Garment> clothes = new ArrayList();
		
		if (temperature > 20) {
			clothes.add(new Dress());
		}
		
		if (temperature <= 20) {
			clothes.add(new Jean());
			clothes.add(new Sweater());
		}
		
		return clothes;
	}
}
