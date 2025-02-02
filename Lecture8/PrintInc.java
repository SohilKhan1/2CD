package Lecture8;

public class PrintInc {
	public static void main(String[] args) {

//		for (int i = 0; i < 5; i++) {
//			print(i);
//		}

		print2(0);

	}

	private static void print2(int i) {
		if (i >= 5) {
			return;
		}
		i = i + 1;
		print2(i);
		System.out.println(i);

	}

//	private static void print(int i) {
//		System.out.println(i);
//
//	}

}
