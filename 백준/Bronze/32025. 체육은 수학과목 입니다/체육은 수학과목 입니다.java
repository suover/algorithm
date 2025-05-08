import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int h = scanner.nextInt();
		int w = scanner.nextInt();

		if (h < w) {
			System.out.println((h * 100) / 2);
		} else {
			System.out.println((w * 100) / 2);
		}
	}
}
