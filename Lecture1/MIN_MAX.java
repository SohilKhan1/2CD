package Lecture1;

import java.util.Iterator;

public class MIN_MAX {
	public static void main(String[] args) {
		int[] arr = { 45, 35, 67, 57, 12 };
		min(arr);
		max(arr);
	}

	private static void max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

	private static void min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
