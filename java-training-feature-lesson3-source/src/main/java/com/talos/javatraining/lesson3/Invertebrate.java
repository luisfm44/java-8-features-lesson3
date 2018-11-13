package com.talos.javatraining.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Invertebrate extends Animal {
	default List<String> getCharacteristics() {
		List<String> characteristics = new ArrayList<>(getParentCharacteristics());
		populateCharacteristics(characteristics);
		return characteristics;
	}

	public default List<String> getParentCharacteristics(){
		return Arrays.asList("Lack of backbones and internal skeletons", "Simple anatomy");
	}

	public void populateCharacteristics(List<String> characteristics);
	
}
