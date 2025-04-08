import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int total = 0;

		for(int i = 0; i < N; i++) {
			total += scanner.nextInt();
		}
		total += (N - 1) * 8;

		System.out.println(total / 24 + " " + total % 24);
	}
}