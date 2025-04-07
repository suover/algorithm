import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();
		int n = 0;
		int m = 0;

		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == ':') {
				n++;
			}
			if(a.charAt(i) == '_') {
				m++;
			}
		}
		System.out.println(a.length() + n + m * 5);
	}
}