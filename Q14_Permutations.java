package com.yash.assignment;

public class Q14_Permutations {

	static void Permutations(String perm, String word) {
		if (word.isEmpty()) {
			System.out.println(perm + word);
			System.out.println();
		} else {
			for (int i = 0; i < word.length(); i++) {

				Permutations(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}

	}

	public static void Permutations(String input) {
		Permutations(" ", input);
	}

	public static void main(String[] args) {

		Permutations("ABCD");
	}

}
