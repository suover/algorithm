import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		int N = scanner.nextInt();

		int j, count = 0;
		for(int i = 0; i < N; i++) {
			String c = scanner.next();
			for(j = 0; j < 5; j++) {
				if(str.charAt(j) != c.charAt(j)) {
					break;
				}
			}
			if(j == 5) {
				count++;
			}
		}
		System.out.println(count);
	}
}
