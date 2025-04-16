import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String s = scanner.next();
		StringBuilder newStr = new StringBuilder();

		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == 'I') {
				newStr.append('i');
			}else if(s.charAt(i) == 'l') {
				newStr.append('L');
			}
		}
		System.out.println(newStr);
	}
}
