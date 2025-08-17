import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] rain = new int[n];
		int[] score = new int[n];

		for(int i = 0; i < n; i++) {
			rain[i] = scanner.nextInt();
		}

		if(rain[0] == 0) {
			score[0] = -1;
		}else {
			score[0] = 1;
		}

		for(int i = 1; i < n; i++) {
			if(rain[i] == 0) {
				score[i] = score[i - 1] - 1;
			}else {
				score[i] = score[i - 1] + 1;
			}
		}

		long total = 0;
		for(int i = 0; i < n; i++) {
			total += score[i];
		}
		System.out.println(total);
	}
}