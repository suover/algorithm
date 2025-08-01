import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();

		int x = (int)((a * b) / c);
		int y = (int)((a / b) * c);

		System.out.println(Math.max(x, y));
	}
}