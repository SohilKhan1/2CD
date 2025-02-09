package Lecture12;

import java.util.*;

public class MergSort {
	public static void main(String[] args) {
		int[] arr = { 60, 20, 40, 50, 90, 70, 30 };
		int[] ans = mergsort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] mergsort(int[] arr, int st, int ed) {
		if (st == ed) {
			int[] b = new int[1];
			b[0] = arr[st];
			return b;
		}

		int mid = (st + ed) / 2;
		int[] fa = mergsort(arr, st, mid);
		int[] sa = mergsort(arr, mid + 1, ed);
		return merg(fa, sa);
	}

	public static int[] merg(int[] arr1, int[] arr2) {
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
