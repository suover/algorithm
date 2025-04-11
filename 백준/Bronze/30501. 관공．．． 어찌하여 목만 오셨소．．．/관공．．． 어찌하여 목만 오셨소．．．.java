import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] arr = new String[N];

		for (int i = 0; i < N; i++){
			arr[i] = scanner.next();
		}
		for (int i = 0; i < N; i++){
			for ( int j = 0; j < arr[i].length(); j++){
				if (arr[i].charAt(j) == 'S') {
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}