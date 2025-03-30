import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int k = scanner.nextInt();
		System.out.print(Math.min(m, k) + Math.min(n - m, n - k));
	}
}