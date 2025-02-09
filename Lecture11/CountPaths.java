package Lecture11;

public class CountPaths {
	static int c = 0;

	public static void main(String[] args) {
		int n = 4;
		int a = count(n, "");
		System.out.println(a);
		System.out.println(c);
	}

	private static int count(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			c = c + 1;
			return 1;
		}
		int a = count(n - 1, ans + 1);
		int b = 0;
		if (n >= 2)
			b = count(n - 2, ans + 2);

		return a + b;
	}

}
