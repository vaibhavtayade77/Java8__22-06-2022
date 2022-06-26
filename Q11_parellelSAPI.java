package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;

public class Q11_parellelSAPI {

	public static void main(String[] args) {

		List<Integer> nos = new ArrayList<Integer>();
		nos.add(107);
		nos.add(405);
		nos.add(96);
		nos.add(56);
		nos.add(235);
		nos.add(345);

		
		System.out.println("find any in parallel stream");
		nos.stream().parallel().filter(n -> n > 300).findAny().ifPresent(System.out::println);

	}
}