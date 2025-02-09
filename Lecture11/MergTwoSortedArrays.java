package Lecture11;

import java.util.Arrays;

public class MergTwoSortedArrays {
	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6, 8, 10, 12 };
		int[] ans = merg(arr1, arr2);
		System.out.println(Arrays.toString(ans));
	}

	protected static int[] merg(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
			} else {
				ans[k] = arr2[j];
				j++;
			}
			k++;
		}

		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}

		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}

		return ans;

	}

}
