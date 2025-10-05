import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		StringBuilder reverse = new StringBuilder();

		for(int i = s.length() - 1; i >= 0; i--) {
			reverse.append(s.charAt(i));
		}

		System.out.println(reverse);
		sc.close();
	}
}