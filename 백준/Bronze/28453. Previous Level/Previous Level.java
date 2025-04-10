import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			int m = scanner.nextInt();
			if(m >= 300) {
				System.out.print("1 ");
			}else if(m >= 275) {
				System.out.print("2 ");
			}else if(m >= 250) {
				System.out.print("3 ");
			}else {
				System.out.print("4 ");
			}
		}
	}
}