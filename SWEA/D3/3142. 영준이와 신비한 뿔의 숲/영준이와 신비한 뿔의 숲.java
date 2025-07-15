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
            int n = sc.nextInt();
			int k = sc.nextInt();
			int t = 0;
			while (k > t) {
				if( 2 * t == n - (k - t)) {
					break;
				}
				t++;
			}
			System.out.printf("#%d %d %d%n", test_case, k - t, t);
		}
	}
}