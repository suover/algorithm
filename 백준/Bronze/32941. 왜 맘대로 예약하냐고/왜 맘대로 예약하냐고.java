import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		int x = scanner.nextInt();
		int n = scanner.nextInt();
		int count = 0;

		for(int i = 0; i < n; i++) {
			int a = scanner.nextInt();
			for(int j = 0; j < a; j++) {
				int b = scanner.nextInt();
				if(b == x) {
					count++;
				}
			}
		}
		if(count == n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}