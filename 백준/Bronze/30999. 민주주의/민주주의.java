import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m = scanner.nextInt();

		int total = 0;
		for(int i = 0; i < n; i++) {
			String str = scanner.next();
			int count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					count++;
				}
			}
			if(count > m / 2) {
				total++;
			}
		}
		System.out.println(total);
	}
}