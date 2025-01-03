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
			int I = scanner.nextInt() - 1;
			int J = scanner.nextInt() - 1;

			while (I < J) {
				int temp = arr[I];
				arr[I++] = arr[J];
				arr[J--] = temp;
			}
		}

		for (int result : arr) {
			System.out.print(result + " ");
		}
	}
}