package com.talos.javatraining.lesson3.classifications;

import java.util.ArrayList;
import java.util.List;

public interface Invertebrate {
	default List<String> getCharacteristics() {
		List<String> characteristics = new ArrayList<>(getParentCharacteristics());
		populateCharacteristics(characteristics);
		return characteristics;
	}

	public abstract List<String> getParentCharacteristics();

	public abstract void populateCharacteristics(List<String> characteristics);
}
