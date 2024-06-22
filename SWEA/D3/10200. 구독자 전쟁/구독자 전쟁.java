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
			int A = sc.nextInt();
			int B = sc.nextInt();

			int minSubscribers = Math.max(0, A + B - N);

			int maxSubscribers = Math.min(A, B);

			System.out.println("#" + test_case + " " + maxSubscribers + " " + minSubscribers);
		}
	}
}