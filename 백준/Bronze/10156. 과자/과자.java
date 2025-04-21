import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		int N = scanner.nextInt();
		int M = scanner.nextInt();

		System.out.println(Math.max(K * N - M, 0));
	}
}