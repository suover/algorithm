import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int total = 0;

		if(a < n) {
			total += a;
		}else {
			total += n;
		}

		if(b < n) {
			total += b;
		}else {
			total += n;
		}

		if(c < n) {
			total += c;
		}else {
			total += n;
		}
		System.out.println(total);
	}
}
