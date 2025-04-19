import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] arr = new String[7];
		int[] num = new int[7];

		int max = num[0];
		int maxIndex = 0;

		for (int i = 0; i < 7; i++) {
			arr[i] = scanner.next();
			num[i] = scanner.nextInt();

			if (max < num[i]) {
				max = num[i];
				maxIndex = i;
			}
		}
		System.out.println(arr[maxIndex]);
	}
}
