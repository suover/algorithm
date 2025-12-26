import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			sum += sc.nextInt();
		}
		if (sum <= 1500) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
