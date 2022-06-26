package com.yash.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;



public class Q4_MaximumMarksUSAPI {
	
	
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(90);
		al.add(75);
		al.add(45);
		al.add(56);
		al.add(78);
		
//		IntSummaryStatistics kk=al.stream().mapToInt((i)->i).summaryStatistics();
//		System.out.println(kk);
		
		System.out.println("The Maximum number in arraylist is : " +Collections.max(al));
		


}
}
