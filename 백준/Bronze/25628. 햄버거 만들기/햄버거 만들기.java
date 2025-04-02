import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int n = a / 2;

		if(n > 0) {
			System.out.println(Math.min(n, b));
		}else {
			System.out.println(0);
		}
	}
}
