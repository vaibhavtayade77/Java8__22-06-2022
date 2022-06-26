package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Q10_ListToMap {

	int id;
	String name;
	String address;
	int salary;

	public Q10_ListToMap(int id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String s[]) {
		List<Q10_ListToMap> emplist = new ArrayList<Q10_ListToMap>();
		emplist.add(new Q10_ListToMap(1, "sujit tiwari", "karve nagar", 25000));
		emplist.add(new Q10_ListToMap(2, "kedar mali", "baner", 22000));
		emplist.add(new Q10_ListToMap(3, "swapnil mayekar", "wakad", 34000));
		emplist.add(new Q10_ListToMap(4, "anand singh", "pashan", 40000));
		emplist.add(new Q10_ListToMap(5, "sanjay jadhao", "mumbai", 45000));
		emplist.add(new Q10_ListToMap(6, "keshav rao", "pune", 48000));
		emplist.add(new Q10_ListToMap(7, "bhavesh kumar", "wakad", 34000));
		emplist.add(new Q10_ListToMap(8, "amit dwivedi", "delhi", 50000));
		emplist.add(new Q10_ListToMap(9, "akshay sunder", "nagpur", 40000));
		emplist.add(new Q10_ListToMap(10, "param singh", "akola", 30000));
		// Collectors.toSet();
		// Map of collection we need key->
		Map<Object, Object> empMap = emplist.stream().collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));
       // Set<Object> empset = emplist.stream().collect(Collectors.toSet(e ->e.getName(),e -> e.getSalary()));
		System.out.println(empMap);
	}
	
	

}
