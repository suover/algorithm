import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		int min = 100;
		int count = 0;

		for (int i = 0; i < 3; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i] <= min) {
				min = arr[i];
				count = i;
			}
		}

		if (count == 0) {
			System.out.format("%d", Math.min(arr[1], arr[2]));
		} else if (count == 1) {
			System.out.format("%d", Math.min(arr[0], arr[2]));
		} else {
			System.out.format("%d", Math.min(arr[0], arr[1]));
		}
	}
}
