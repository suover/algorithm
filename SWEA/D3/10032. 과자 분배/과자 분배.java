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
			int N = sc.nextInt(); // 과자의 수
			int K = sc.nextInt(); // 사람의 수

			int minDifference = findMinDifference(N, K);

			System.out.println("#" + test_case + " " + minDifference);
		}

		sc.close();
	}

	private static int findMinDifference(int N, int K) {
		if (N % K == 0) {
			return 0;
		} else {
			return 1;
		}
	}
}