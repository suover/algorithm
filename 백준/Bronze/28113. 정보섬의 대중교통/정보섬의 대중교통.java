import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if(N <= B && B == A) {
			System.out.println("Anything");
		}else if(N <= B && B - A > 0) {
			System.out.println("Bus");
		}else {
			System.out.println("Subway");
		}
	}
}