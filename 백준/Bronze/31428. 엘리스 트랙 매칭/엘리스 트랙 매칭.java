import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String[] arr = new String[N];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.next();
		}

		String str = scanner.next();
		int count = 0;

		for (String s : arr) {
			if (s.equals(str)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
