import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;

		for (int i = 0; i < 5; i++) {
			int a = scanner.nextInt();
			if (n == a) count++;
		}
		System.out.println(count);
	}
}