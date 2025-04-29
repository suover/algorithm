import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();

		if (s.charAt(1) == '0') {
			System.out.println(10 + Integer.parseInt(s.substring(2)));
		} else {
			System.out.println(Character.getNumericValue(s.charAt(0)) + Integer.parseInt(s.substring(1)));
		}
	}
}
