import java.util.Arrays;
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
			int[] data = new int[N];
			for (int i = 0; i < N; i++) {
				data[i] = sc.nextInt();
			}

			Arrays.sort(data);
			System.out.print("#" + test_case + " ");
			for (int i = 0; i < N; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}
	}
}