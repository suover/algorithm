import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		if (A + B >= (2 * C)) {
			System.out.println((A + B) - (2 * C));
		} else {
			System.out.println(A + B);
		}
	}
}
