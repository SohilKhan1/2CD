package Lecture6;

import java.util.Arrays;

public class Valid_Anagram {
	public static void main(String[] args) {
		String str1 = "cat";
		String str2 = "tac";

		boolean flag = check1(str1, str2);
		System.out.println(flag);
	}

	private static boolean check1(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
//		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;

	}

}
