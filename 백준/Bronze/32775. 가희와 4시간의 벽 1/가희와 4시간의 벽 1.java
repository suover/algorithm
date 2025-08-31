import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int S = scanner.nextInt();
		int F = scanner.nextInt();

		if (S <= F) {
			System.out.println("high speed rail");
		} else {
			System.out.println("flight");
		}
	}
}
