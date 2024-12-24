import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		String S = scanner.next();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);

			if (arr[c - 'a'] == -1) {
				arr[c - 'a'] = i;
			}
		}

		for (int result : arr) {
			System.out.print(result + " ");
		}
	}
}