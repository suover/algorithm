import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 int N = scanner.nextInt();
		 int M = scanner.nextInt();

		 int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < M; i++) {
			int temp;
			int num1 = scanner.nextInt() - 1;
			int num2 = scanner.nextInt() - 1;

			temp = arr[num1];
			arr[num1] = arr[num2];
			arr[num2] = temp;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}