package Lecture13;

import java.util.Arrays;

public class PartitioningIndex {
	public static void main(String[] args) {
		int[] arr = { 4, 10, 12, 7, 5, 8 };
		int si = 0;
		int ed = arr.length - 1;
		int pi = findPI(arr, si, ed);
		System.out.println(pi);
		System.out.println(Arrays.toString(arr));

	}

	private static int findPI(int[] arr, int si, int ed) {
		int pivot = arr[ed];
		int pi = si;

		for (int i = si; i < ed; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[pi];
				arr[pi] = temp;
				pi++;
			}

		}

		int temp = arr[ed];
		arr[ed] = arr[pi];
		arr[pi] = temp;

		return pi;
	}

}
