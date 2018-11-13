package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Reptile extends Animal{
	default List<String> getCharacteristics() {
		List<String> characteristics = new ArrayList<>(getReptileCharacteristics());
		populateCharacteristics(characteristics);
		return characteristics;
	}

	public static List<String> getReptileCharacteristics()
	{
		return Arrays.asList("They ruled the earth for over 150 million years", "They can lay some distance away from bodies of water");
	}

	public abstract void populateCharacteristics(List<String> characteristics);
}
