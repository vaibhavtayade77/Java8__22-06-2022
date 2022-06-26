package com.yash.assignment;

public class Q15_Pythagoras_Template {

//	static boolean isTriplet(int ar[], int n) {
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				for (int k = j + 1; k < n; k++) {
//
//					int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];
//
//					if (x == y + z || y == x + z || z == x + y)
//						return true;
//				}
//			}
//		}
//
//		return false;
//
//	}
//
//	public static void main(String[] args) {
//		int ar[] = { 3, 1, 4, 6, 9 };
//		int ar_size = ar.length;
//		if (isTriplet(ar, ar_size) == true)
//			System.out.println("True");
//		else
//			System.out.println("False");
//	}
//}
	public static void main(String[] args) {
		int array[] = { 4, 3, 5, 12, 13, 5, 9, 1, 8, 15, 289 };
		int count = 0;

		for (int i = 0; i <= array.length - 3; i++) {
			int a = array[i] * array[i];
			int b = array[i + 1] * array[i + 1];
			int c = array[i + 2] * array[i + 2];

			if (a == b + c || b == a + c || c == a + b) {
				count++;
			}
		}
		System.out.println(  count + " numbers satisfy pythagoras template");
	}

}
