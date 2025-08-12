import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();

		int n = scanner.nextInt();

		int total = a + b + c + d;
		int newAverage = total;
		int count = 0;
		while(newAverage / 4 < n) {
			count++;
			newAverage = total + count;
		}
		System.out.println(count);
	}
}