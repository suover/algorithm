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
            int sum = 0;
			for(int i = 0; i < 5; i++) {
				int tmp = sc.nextInt();
				sum += Math.max(tmp, 40);
			}
			System.out.println("#" + test_case + " " + sum / 5);
		}
	}
}