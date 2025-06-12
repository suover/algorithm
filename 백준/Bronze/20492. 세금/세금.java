import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.print((int)(N * 0.78) + " ");
		System.out.print((int)(N * 0.8 + N * 0.2 * 0.78));
	}
}
