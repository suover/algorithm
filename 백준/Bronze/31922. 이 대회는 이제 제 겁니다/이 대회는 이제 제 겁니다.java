import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int P = scanner.nextInt();
		int C = scanner.nextInt();

		System.out.println(Math.max(A + C, P));
	}
}