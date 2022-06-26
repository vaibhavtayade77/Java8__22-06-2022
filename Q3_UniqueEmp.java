package com.yash.assignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q3_UniqueEmp {
	
	public static void main(String[] args) {
		
     String name;
     
     List<String> al=new  ArrayList<String>();
     al.add("sujit");
     al.add("akash");
     al.add("sujit");
     al.add("param");
     al.add("sujit");
     
    
     
     List<String> sort=al.stream().sorted().collect(Collectors.toList());
     List<String> uni=sort.stream().distinct().collect(Collectors.toList());
     System.out.println("The Sorted emp Names are : " +sort);
     System.out.println("The unique emp name are : " +uni);
	}

}
