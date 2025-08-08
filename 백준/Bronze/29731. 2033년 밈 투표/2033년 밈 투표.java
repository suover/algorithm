import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] p = {"Never gonna give you up", "Never gonna let you down", "Never gonna run around and desert you", "Never gonna make you cry", "Never gonna say goodbye", "Never gonna tell a lie and hurt you", "Never gonna stop"};

		int i, j;
		int n = scanner.nextInt();
		String[] a = new String[n + 1];
		String result = "Yes";

		for(i = 0; i < a.length; i++) {
			a[i] = scanner.nextLine();
		}

		for(i = 1; i < a.length; i++) {
			result = "Yes";
			for(j = 0; j < p.length; j++) {
				if(a[i].equals(p[j])) {
					result = "No";
					break;
				}
			}

			if(result.equals("Yes")) {
				break;
			}
		}
		System.out.println(result);
	}
}