package com.yash.assignment;

interface Maximum{
	
	void findmax();
	
	
}

public class Q12_MaxLExpression {
	
	
		public static void main(String[] args) {

			Maximum obj = () -> {
				int a[] = { 6, 9, 87, 90, 65, 105 };
				int max = a[0];

				for (int i = 1; i < a.length; i++) {

					if (a[i] > max) {

						max = a[i];

					}

				}
				System.out.println("Maximum number is " + max);
	};
	obj.findmax();

}}
