import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += scanner.nextInt();
		}
		System.out.println(sum / 60);
		System.out.println(sum % 60);
	}
}
