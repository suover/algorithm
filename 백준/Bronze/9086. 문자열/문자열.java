import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {
			String s = scanner.next();
			System.out.print(s.charAt(0));
			System.out.println(s.charAt(s.length()-1));
		}
	}
}