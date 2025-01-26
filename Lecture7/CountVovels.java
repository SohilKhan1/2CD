package Lecture7;

public class CountVovels {

	public static void main(String[] args) {
		String str = "hello";

		int vovels = 0;
		int conso = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vovels++;
			} else {
				conso++;
			}
		}
		System.out.println(vovels);
		System.out.println(conso);
		System.out.println(str.length() - vovels);
	}

}
