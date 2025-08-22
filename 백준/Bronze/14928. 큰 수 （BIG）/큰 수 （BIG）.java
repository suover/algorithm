import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		long temp = 0;
		for (int i = 0; i < N.length(); i++) {
			temp = (temp * 10 + (N.charAt(i) - '0')) % 20000303;
		}
		System.out.println(temp);
	}
}