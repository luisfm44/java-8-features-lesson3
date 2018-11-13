package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Fish extends Animal {
	default List<String> getCharacteristics() {
		List<String> characteristics = new ArrayList<>(getFishCharacteristics());
		populateCharacteristics(characteristics);
		return characteristics;
	}

	public static List<String> getFishCharacteristics()
	{
		return Arrays.asList("They breathe using gills", "They have dominated the world's oceans, lakes and rivers");
	}

	public abstract void populateCharacteristics(List<String> characteristics);
}
