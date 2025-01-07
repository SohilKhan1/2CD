package Lecture1;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

//		int[] arr1 = new int[5];
//		System.out.println(arr1);

		System.out.println(Arrays.toString(arr));

		System.out.println("------------");
		reverse(arr);
		
		System.out.println("------------");
		reverse2(arr);

	}

	private static void reverse2(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));

	}

	private static void reverse(int[] arr) {
		int[] arr2 = new int[arr.length];
		int k = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			int val = arr[i];
			arr2[k] = val;
			k++;
		}
		System.out.println(Arrays.toString(arr2));

	}

}
