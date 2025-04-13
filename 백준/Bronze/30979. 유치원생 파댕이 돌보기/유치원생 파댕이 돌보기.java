import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();
		int N = scanner.nextInt();
		int total = 0;

		for(int i = 0; i < N; i++) {
			total += scanner.nextInt();
		}

		if(total >= T) {
			System.out.println("Padaeng_i Happy");
		} else {
			System.out.println("Padaeng_i Cry");
		}
	}
}