package Lecture6;

public class ReverseString {

	public static void main(String[] args) {
		String str = "hello";

		int n = str.length();

		String s = "";
		for (int i = n - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.println(ch);
			s = s + ch;
		}
		System.out.println(s);

	}

}
