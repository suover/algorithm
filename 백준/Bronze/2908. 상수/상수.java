import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int A = Integer.parseInt(new StringBuilder(String.valueOf(scanner.nextInt())).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(String.valueOf(scanner.nextInt())).reverse().toString());

		System.out.print(Math.max(A, B));
	}
}