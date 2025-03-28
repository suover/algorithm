import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double k = 1 / (1 + Math.pow(10, (b - a) / 400.0));

		System.out.printf("%.20f%n", k);
	}
}
