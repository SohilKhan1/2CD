package Lecture11;

public class Subsequences {
	public static void main(String[] args) {
		String str = "abc";
		find(str, "");
	}

	private static void find(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		find(str.substring(1), ans);
		find(str.substring(1), ans + ch);

	}

}
