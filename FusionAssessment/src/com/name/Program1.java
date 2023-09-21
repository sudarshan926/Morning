package com.name;

import java.util.*;

public class Program1 {
	public static void main(String[] args) {
		Map<String, String> flowerToBouquet = new HashMap<>();

		addFlowerToBouquet(flowerToBouquet, "Red Rose", "Bouquet1");
		addFlowerToBouquet(flowerToBouquet, "White Lily", "Bouquet1");
		addFlowerToBouquet(flowerToBouquet, "Blue Orchid", "Bouquet1");
		addFlowerToBouquet(flowerToBouquet, "Yellow Tulip", "Bouquet2");
		addFlowerToBouquet(flowerToBouquet, "Pink Rose", "Bouquet2");
		addFlowerToBouquet(flowerToBouquet, "Purple Daisy", "Bouquet2");
		addFlowerToBouquet(flowerToBouquet, "Orange Lily", "Bouquet3");
		addFlowerToBouquet(flowerToBouquet, "Red Carnation", "Bouquet3");
		addFlowerToBouquet(flowerToBouquet, "Yellow Sunflower", "Bouquet3");

		String input1 = "Red Rose";
		String input2 = "Pink Lily";

		String result1 = findBouquet(flowerToBouquet, input1);
		String result2 = findBouquet(flowerToBouquet, input2);

		System.out.println("Input: " + input1 + " ; Output: " + result1);
		System.out.println("Input: " + input2 + " ; Output: " + result2);
	}

	public static void addFlowerToBouquet(Map<String, String> flowerToBouquet, String flower, String bouquet) {
		flowerToBouquet.put(flower, bouquet);
	}

	public static String findBouquet(Map<String, String> flowerToBouquet, String flower) {
		String bouquet = flowerToBouquet.get(flower);
		return (bouquet != null) ? bouquet : "None"; // Return the bouquet name or "None" if not found
	}
}
