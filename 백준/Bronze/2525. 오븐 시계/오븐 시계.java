import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();

		int m = 60 * A + B;
		m += C;

		int hour = (m / 60) % 24;
		int minute = m % 60;

		System.out.print(hour + " " + minute);
	}
}