import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		for (int i = 1; i <= n; i++) {
			num1 = num1 + i;
		}
		System.out.println(num1);

		for (int j = 1; j <= n; j++) {
			num2 = num2 + j;
		}
		System.out.println(num2 * num2);

		for (int k = 1; k <= n; k++) {
			num3 = (num3 + (k * k * k));
		}
		System.out.println(num3);
	}
}