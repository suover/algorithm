import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		int s = scanner.nextInt();

		if(s == 0 && 12 <= t && t <= 16) {
			System.out.println("320");
		}else {
			System.out.println("280");
		}
	}
}
