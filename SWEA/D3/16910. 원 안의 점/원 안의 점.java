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
			int result = 0;

			for(int i = -N; i <= N; i++) {
				for(int j = -N; j <= N; j++) {
					if( i * i + j * j <= N * N) {
						result++;
					}
				}
			}
			System.out.printf("#%d %d\n", test_case, result);
		}
	}
}