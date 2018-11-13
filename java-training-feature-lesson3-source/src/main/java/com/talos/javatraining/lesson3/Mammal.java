package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Mammal extends Animal{
	default List<String> getCharacteristics() {
		List<String> characteristics = new ArrayList<>(getMammalCharacteristics());
		populateCharacteristics(characteristics);
		return characteristics;
	}

	public static List<String> getMammalCharacteristics()
	{
		return Arrays.asList("They have hair or fur", "They suckle milk when they are young");
	}

	public abstract void populateCharacteristics(List<String> characteristics);
}
