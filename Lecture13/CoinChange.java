package Lecture13;

public class CoinChange {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5 };
		int amount = 5;
		find1(arr, amount, "");
		System.out.println("----------------");
		find2(arr, amount, "");
	}

	private static void find1(int[] arr, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (amount - arr[i] >= 0) {
				amount = amount - arr[i];
				find1(arr, amount, ans + arr[i]);
				//amount = amount + arr[i];
			}
		}
	}

	private static void find2(int[] arr, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			if (amount - arr[i] >= 0) {
				find2(arr, amount - arr[i], ans + arr[i]);
			}
		}
	}

}
