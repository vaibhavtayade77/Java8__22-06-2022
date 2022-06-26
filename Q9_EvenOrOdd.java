package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q9_EvenOrOdd {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(56);
		al.add(98);
		al.add(87);
		al.add(34);
		
		List<Integer> even = al.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("The even numbers are : " +even);
		
		List<Integer>odd = al.stream().filter(i-> i%2!=0).collect(Collectors.toList());
		System.out.println("The odd numbers are : "+odd);
		
		
	}
}




//     int arr[] = { 12, 56, 55, 45, 43, 45, 56, 78 };
//
//		System.out.println("Given Array Elements : ");
//
//		for (int i = 0; i < arr.length; i++) {
//
//			System.out.println(arr[i] + "  ");
//		}
//
//		System.out.println("\n Even number of the array");
//
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				System.out.println(arr[i] + " ");
//			}
//		}
//
//		System.out.println("\nOdd number of the array");
//		{
//
//			for (int i1 = 0; i1 < arr.length; i1++) {
//
//				if (arr[i1] % 2 != 0) {
//					System.out.println(arr[i1] + " ");
//
//				}
//			}
//
//		}
//	}
