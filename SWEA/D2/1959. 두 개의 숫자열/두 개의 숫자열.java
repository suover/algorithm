import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
			int M = sc.nextInt();

			int[] A = new int[N];
			int[] B = new int[M];

			for (int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}

			for (int i = 0; i < M; i++) {
				B[i] = sc.nextInt();
			}

			int answer = 0;
			for (int i = 0; i <= Math.abs(N - M); i++) {
				int sum = 0;
				for (int j = 0; j < Math.min(N, M); j++) {
					if (N > M) {
						sum += A[i + j] * B[j];
					} else {
						sum += A[j] * B[i + j];
					}
				}
				answer = Math.max(answer, sum);
			}
			System.out.printf("#%d %d\n", test_case, answer);
		}
	}
}