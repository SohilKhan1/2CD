package Lecture9;

public class Fibbonachi {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(fibbo(n));

	}

	private static int fibbo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int sp1 = fibbo(n - 1);
		int sp2 = fibbo(n - 2);
		int bp = sp1 + sp2;
		return bp;
	}

}
