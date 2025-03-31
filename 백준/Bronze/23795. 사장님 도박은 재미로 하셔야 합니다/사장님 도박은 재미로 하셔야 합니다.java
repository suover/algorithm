import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int total = 0;
		int money;

		while (true) {
			money = scanner.nextInt();
			if (money == -1) {
				break;
			}
			total += money;
		}
		System.out.println(total);
	}
}