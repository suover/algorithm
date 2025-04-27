import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int S = scanner.nextInt();
		int K = scanner.nextInt();
		int H = scanner.nextInt();

		int min = Math.min(Math.min(S, K), H);

		if (S + K + H >= 100) {
			System.out.println("OK");
		} else if (min == S) {
			System.out.println("Soongsil");
		} else if (min == K) {
			System.out.println("Korea");
		} else {
			System.out.println("Hanyang");
		}
	}
}