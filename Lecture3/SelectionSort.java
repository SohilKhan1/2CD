package Lecture3;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 14, 13, 11, 10, 9 };

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
