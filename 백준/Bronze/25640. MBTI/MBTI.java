import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String mbti = scanner.next();
		int n = scanner.nextInt();

		int count = 0;
		for (int i = 0; i < n; i++) {
			String s = scanner.next();
			if (mbti.equals(s)) {
				count++;
			}
		}

		System.out.println(count);
	}
}
