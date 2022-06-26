package com.yash.assignment;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Q8_EvenOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println("It is an Even Number");
		} else {
			System.out.println("It is an Odd Number");
		}
	}

	public static void condition(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}

}