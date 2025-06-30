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
            double p = sc.nextDouble();
			double q = sc.nextDouble();
			System.out.printf("#%d %s%n", test_case, 1 - p < p * (1 - q) ? "YES" : "NO");
		}
	}
}