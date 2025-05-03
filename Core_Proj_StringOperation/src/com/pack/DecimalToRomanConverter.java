package com.pack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DecimalToRomanConverter {


	public static Map<String, Integer> baseValueGenerator(int number) {

		Map<String, Integer> baseList = new LinkedHashMap<String, Integer>();

		baseList.put("I", 1);
		baseList.put("IV", 4);
		baseList.put("V", 5);
		baseList.put("IX", 9);
		baseList.put("X", 10);
		baseList.put("XL", 40);
		baseList.put("L", 50);
		baseList.put("XC", 90);
		baseList.put("C", 100);
		baseList.put("CD", 400);
		baseList.put("D", 500);
		baseList.put("CM", 900);
		baseList.put("M", 1000);

		Map<String, Integer> baseValues = new LinkedHashMap<String, Integer>();

		baseList.forEach((key, value) -> {
			// System.out.println(key + " " + value);
			// check value is greater and equal in base list
			if (number >= value) {
				baseValues.put(key, value);
			}
		});

		//System.out.println(baseValues);
		String lastKey = null;
		Integer lastval = 0;
		if (!baseValues.isEmpty()) {

			// There's no direct way to get the last key in a HashMap
			// but you can iterate and keep track of the last key-value pair

			for (String key : baseValues.keySet()) {
				lastKey = key;
			}

			if (lastKey != null) {
				// System.out.println("Last key: " + lastKey);
				// System.out.println("Last value: " + baseValues.get(lastKey));
				lastval = baseValues.get(lastKey);
			}
		} else {
			System.err.println("Map is empty");
		}

		Map<String, Integer> basekeyValue = new LinkedHashMap<String, Integer>();
		basekeyValue.put(lastKey, lastval);

		return basekeyValue;
	}

	// function to Convert Decimal to Roman

	public static String DecToRom(int no) {

		StringBuilder romConverted = new StringBuilder();

		// Initialize the reminder and Quotient

		int remainder = no; // 3549
		int quotient = 0;
		String romKey = null;
		int value = 0;

		Map<String, Integer> basevalues;

		// No Generation Process
		while (remainder != 0) {

			// get Quotient for Concate process
			basevalues = baseValueGenerator(remainder);
			for (String key : basevalues.keySet()) {
				romKey = key.toString();
				value = basevalues.get(key); // 1000
			}

			quotient = remainder / value;

			for (int i = 0; i < quotient; i++) {

				romConverted.append(romKey);

			}

			if (remainder != 0)
				remainder = remainder % value;
			// Concate process

		}
		
		return romConverted.toString();

	}

	public static void main(String[] args) {

		// System.out.println("baseValueGenerator : : "+ baseValueGenerator(3549));

		System.out.println(DecToRom(48));
	}
}
