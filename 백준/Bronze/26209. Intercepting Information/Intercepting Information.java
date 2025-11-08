import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String[] bits = s.split("\\s+");

		for (String bit : bits) {
			if (bit.equals("9")) {
				System.out.println("F");
				return;
			}
		}
		System.out.println("S");
	}
}
