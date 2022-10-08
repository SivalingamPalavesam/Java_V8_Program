package com.java.java8version;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PositiveOrNegativeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[] {1,2,3,4,2,2,4,-3,-4};

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				System.out.println("Positive Number:" + a[i]);
			} else {
				System.out.println("Negative Number:" + a[i]);
			}
		}
	}

}
