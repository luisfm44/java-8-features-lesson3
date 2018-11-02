package com.talos.javatraining.lesson3;

import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

public interface Animal {

	List<String> getCharacteristics();

	/**
	 * Returns the full description about the animal
	 * 
	 * @return the description
	 */
	default String getFullDescription() {
		StringBuilder builder = new StringBuilder();
		String name = getName();
		String lastChr = name.substring(name.length() - 1);
		builder.append(name).append(lastChr.equals("s") ? "es" : "s").append(" have these characteristics :");
		for (String characteristic : getCharacteristics()) {
			builder.append(StringUtils.LF).append(StringUtils.CR).append("- ").append(characteristic);
		}
		return builder.toString();
	}

	default String getName() {
		return getClass().getSimpleName();
	}

	static Object create(String name) throws ClassNotFoundException {
		try {
			if (Objects.nonNull(name)) {
				return (Object) Class.forName(name).newInstance();
			} else {
				return null;
			}

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			return null;
		}

	}

}
