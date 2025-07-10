import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int n = sc.nextInt();
			int k = sc.nextInt();
			boolean[] students = new boolean[n + 1];
			for (int i = 0; i < k; i++) {
				students[sc.nextInt()] = true;
			}
			System.out.print("#" + test_case + " " );
			for(int i = 1; i <= n; i++) {
				if (!students[i]) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}