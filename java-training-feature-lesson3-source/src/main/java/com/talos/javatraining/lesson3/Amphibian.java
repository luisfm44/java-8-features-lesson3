package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Amphibian extends Animal{
	default List<String> getCharacteristics() {
		List<String> characteristics = new ArrayList<>(getAmphibianCharacteristics());
		populateCharacteristics(characteristics);
		return characteristics;
	}

	public static List<String> getAmphibianCharacteristics()
	{
		return Arrays.asList("They have a semi-aquatic lifestyle",
				"They have to stay near bodies of water, both to maintain the moisture of their skin and to lay their eggs","Other Characteristics");
	}
	public abstract void populateCharacteristics(List<String> characteristics);
}
