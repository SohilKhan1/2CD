
public class AddArrays {
	public static void main(String[] args) {
		int[] arr1 = { 5, 6, 7 };
		int[] arr2 = { 5, 6, 7 };

		int i = arr1.length - 1;
		int j = arr2.length - 1;

		int carry = 0;
		while (i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j];
			sum = sum + carry;
			int rem = sum % 10;
			carry = sum / 10;
			System.out.println(rem);
			i--;j--;
		}
		if(carry>0)
		System.out.println(carry);
	}
}
