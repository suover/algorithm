import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		for (int i = 0; i < N; i++) {
			while (scanner.hasNext()) {
				StringBuilder sb = new StringBuilder(scanner.next());
				System.out.println(sb.reverse());
			}
		}
	}
}