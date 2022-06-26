package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q2_DistinctMarks {
	
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<>();
		al.add(89);
		al.add(90);
		al.add(70);
		al.add(70);
		al.add(67);
		al.add(70);
		
		List<Integer> dis=al.stream().distinct().collect(Collectors.toList());
		System.out.println("The distinct marks from the list :"+dis);
		
	}

	
	
}
