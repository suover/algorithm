import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int p = 1;
		int q = 1;

		for(int i = 0; i < n; i++) {
			int temp;
			p += a;
			q += b;

			if(p < q) {
				temp = p;
				p = q;
				q = temp;
			}else if(p == q) {
				q = q - 1;
			}
		}
		System.out.println(p + " " + q);
	}
}