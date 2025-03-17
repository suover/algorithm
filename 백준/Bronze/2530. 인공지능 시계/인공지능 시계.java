import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		c += d;
		b += c/60;
		c %= 60;
		a += b/60;
		b %= 60;
		a %= 24;

		System.out.println(a + " " + b + " " + c);
	}
}