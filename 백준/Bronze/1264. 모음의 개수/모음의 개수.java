import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			String s = scanner.nextLine().toLowerCase(); ;
			int count = 0;
			if (s.equals("#"))
				break;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u')
					count++;
			}
			System.out.println(count);
		}
	}
}
