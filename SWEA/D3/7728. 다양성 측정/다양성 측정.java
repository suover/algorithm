import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=Integer.parseInt(sc.next());

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int[] arr = new int[10];

			String s = sc.next();
			for (int i = 0; i < s.length(); i++) {
				int n = s.charAt(i) - '0';
				arr[n]++;
			}

			int cnt = 0;
			for (int i = 0; i < 10; i++) {
				if(arr[i] > 0) cnt++;
			}
			System.out.format("#%d %d\n", test_case, cnt);
		}
	}
}