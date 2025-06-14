import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int[] arr = new int[a];

		for(int i = 0; i < a; i++) {
			arr[i] = scanner.nextInt();
		}

		int b = scanner.nextInt();
		int[] arr2 = new int[b];

		for(int i = 0; i < b; i++) {
			arr2[i] = scanner.nextInt();
		}

		int total = 0;
		for(int i = 0; i < b; i++) {
			total += arr[arr2[i] - 1];
		}

		System.out.println(total);
	}
}
