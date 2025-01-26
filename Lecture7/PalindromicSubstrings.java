package Lecture7;

import Lecture6.CheckPalindrom;

public class PalindromicSubstrings extends CheckPalindrom {

	public static void main(String[] args) {
		String str = "hello";

		// Using OOPS Concept
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String s = str.substring(i, j);
				if (check2(s) == true) {
					System.out.println(s);
				}
			}
		}
	}

}
