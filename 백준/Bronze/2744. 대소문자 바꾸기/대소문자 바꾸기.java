import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				c = Character.toUpperCase(c);
			} else {
				c = Character.toLowerCase(c);
			}
			System.out.print(c);
		}
	}
}