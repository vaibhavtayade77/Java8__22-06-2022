package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q7_EvenPrice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> itemlist=new ArrayList<Integer>();
		itemlist.add(67);
		itemlist.add(56);
		itemlist.add(56);
		itemlist.add(34);
		itemlist.add(45);
		itemlist.add(87);
		
		List<Integer> even = itemlist.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("The even price from the list : "+even);
}
}
		
		

			
		
	
	
	


