package com.talos.javatraining.lesson3.impl;

import java.util.ArrayList;
import java.util.List;

import com.talos.javatraining.lesson3.Animal;

public abstract class AbstractAnimal implements Animal {
	@Override
	public List<String> getCharacteristics() {
		List<String> characteristics = new ArrayList<>(getParentCharacteristics());
		populateCharacteristics(characteristics);
		return characteristics;
	}

	public abstract List<String> getParentCharacteristics();

	public abstract void populateCharacteristics(List<String> characteristics);
}