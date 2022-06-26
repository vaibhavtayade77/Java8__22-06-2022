package com.yash.assignment;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;


public class Q6_LessThanAvgPrice {

	public static void main(String[] args) {
		
		ArrayList<Integer> IP=new ArrayList<Integer>();
		IP.add(98);
		IP.add(77);
		IP.add(98);
		IP.add(87);
		IP.add(34);
		IP.add(88);
		IP.add(99);
		IP.add(81);
		IP.add(66);
		
		
		
		Double avgmark = IP.stream().mapToDouble(s -> s.intValue()).average().getAsDouble();
		System.out.println("Average of marks : " +avgmark);
		
		List<Integer> lta=IP.stream().filter(i -> i<avgmark).collect(Collectors.toList());
		
		System.out.println("List of numbers less than average : " +lta);
		
	}
	}

		