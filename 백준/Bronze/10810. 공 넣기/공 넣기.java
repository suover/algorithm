import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < M; i++) {
			int I = scanner.nextInt() - 1;
			int J = scanner.nextInt();
			int K = scanner.nextInt();

			for (int j = I; j < J; j++) {
				arr[j] = K;
			}
		}

		for (int result : arr) {
			System.out.print(result + " ");
		}
	}
}