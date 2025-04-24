import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int S = scanner.nextInt();
		int T = scanner.nextInt();
		int D = scanner.nextInt();
		System.out.println(D / (2 * S) * T);
	}
}