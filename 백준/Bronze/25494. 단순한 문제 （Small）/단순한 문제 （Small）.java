import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();

		for(int i = 0; i < t; i++) {
			int count = 0;
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			for(int j = 1; j <= a; j++) {
				for(int k = 1; k <= b; k++) {
					for(int l = 1; l <= c; l++) {
						if((j % k) == (k % l) && (k % l) == (l % j)) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
