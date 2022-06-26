package com.yash.assignment;

import java.util.ArrayList;

import java.util.List;

public class Q5_MaxLengthString {
	public static void main(String[] args) {
		
		 String[] str = {"sujit", "vishal", "nikhil", "sadashiv", "nitin","amit"};

	        List<Integer> stringcount= new ArrayList<Integer>();

	        for(String s:str) {
	            int cnt=0;
	            char[]arr=s.toCharArray();
	            for(char ch:arr) {
	                cnt++;

	            }
	            stringcount.add(cnt);


	        }
	        System.out.println(stringcount);
	        Integer max=stringcount.stream().max((s1,s2)->s1.intValue()>s2.intValue()?1:-1).get();
	        System.out.println("Maximum length of given longest string :"+max);
		
	

	}
}