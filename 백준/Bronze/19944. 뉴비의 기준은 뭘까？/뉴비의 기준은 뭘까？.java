import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), m = scanner.nextInt();
		if (m <= 2) {
			System.out.println("NEWBIE!");
		} else if (n < m) {
			System.out.println("TLE!");
		} else {
			System.out.println("OLDBIE!");
		}
	}
}