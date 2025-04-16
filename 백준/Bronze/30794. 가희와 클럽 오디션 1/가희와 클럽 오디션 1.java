import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String s = scanner.next();
		int score = 0;

		switch (s) {
			case "miss":
				score = 0;
				break;
			case "bad":
				score = n * 200;
				break;
			case "cool":
				score = n * 400;
				break;
			case "great":
				score = n * 600;
				break;
			case "perfect":
				score = n * 1000;
				break;
		}
		System.out.println(score);
	}
}