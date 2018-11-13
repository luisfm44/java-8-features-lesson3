package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Bird extends Animal{
	default List<String> getCharacteristics() {
		List<String> characteristics = new ArrayList<>(getBirdCharacteristics());
		populateCharacteristics(characteristics);
		return characteristics;
	}

	public static List<String> getBirdCharacteristics()
	{
		return Arrays.asList("Coat of feathers", "Warm-blooded metabolisms");
	}

	public abstract void populateCharacteristics(List<String> characteristics);
}
