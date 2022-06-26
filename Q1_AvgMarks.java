package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Q1_AvgMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Marks");
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 5; i++) {
			int c = sc.nextInt();
			list.add(c);

		}
		for (int d : list) {

		}
		double avg = list.stream().collect(Collectors.averagingDouble(e -> e));
		System.out.println("Avg marks is :-");
		System.out.println(avg);
	}
}

//	public static void main(String[] args) {
//
//		int marks[] = new int[5], i;
//		float sum = 0, average, tmarks;
//
//		Scanner aa = new Scanner(System.in);
//		System.out.println("Please enter 5 marks : ");
//
//		for (i = 0; i < 5; i++) {
//			marks[i] = aa.nextInt();
//
//			sum = sum + marks[i];
//
//		}
//
//		average = sum / 5;
////		tmarks = sum + marks[i];
//
//		System.out.println("Average Marks = " + average);
//		System.out.println("Total Marks = " + sum);
//	}
