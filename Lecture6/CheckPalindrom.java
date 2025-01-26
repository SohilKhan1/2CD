package Lecture6;

public class CheckPalindrom {
	public static void main(String[] args) {
		String str = "abcba";

		check1(str);
		check2(str);
	}

	protected static boolean check2(String str) {

		int st = 0;
		int ed = str.length() - 1;
		while (st < ed) {
			if (str.charAt(st) != str.charAt(ed)) {
				//System.out.println("Not a Palindrom");
				return false;
			}
			st++;
			ed--;
		}
//		System.out.println("Palindrom");
		return true;

	}

	private static void check1(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			s = s + ch;
		}

		if (str.equals(s)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not a Palindrom");
		}

	}

}
