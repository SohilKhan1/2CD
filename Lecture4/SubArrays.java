package Lecture4;

public class SubArrays {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		subarray(arr);
		subarray2(arr);
	}

	private static void subarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
					System.out.print(arr[k]);
				}
				System.out.println(" Sum = " + sum);
			}
		}
	}

	private static void subarray2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int k = i; k < arr.length; k++) {
				sum += arr[k];
				System.out.println("Sum = " + sum);
			}

		}

	}

}
