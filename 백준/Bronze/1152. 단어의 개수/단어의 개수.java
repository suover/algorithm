import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		StringTokenizer stringTokenizer = new StringTokenizer(str, " ");

		System.out.println(stringTokenizer.countTokens());
	}
}