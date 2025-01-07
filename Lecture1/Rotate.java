package Lecture1;

import java.util.Arrays;

public class Rotate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		System.out.println(Arrays.toString(arr));
		System.out.println("------------");
		reverse(arr, k);
	}

	private static void reverse(int[] arr, int k) {

		for (int j = 1; j <= k; j++) {
			
			int temp = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = temp;
			System.out.println(Arrays.toString(arr));

		}


	}

}
