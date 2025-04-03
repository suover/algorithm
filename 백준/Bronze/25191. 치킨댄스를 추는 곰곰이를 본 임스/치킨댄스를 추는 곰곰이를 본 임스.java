import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		int count = A / 2 + B;

		System.out.println(Math.min(N, count));
	}
}