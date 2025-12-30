import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;

		for (int i = 0; i < 2; i++) {
			a += sc.nextInt();
			b += sc.nextInt();
		}
		if (a < b) {
			System.out.println("Hanyang Univ.");
		} else if (a > b) {
			System.out.println("Yongdap");
		} else {
			System.out.println("Either");
		}
	}
}