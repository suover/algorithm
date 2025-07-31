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
			int m = sc.nextInt();
			int[] a = new int[n];
			int cnt = 0;
			int idx = 0;

			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				if(a[i] == 1)
					idx = i;
			}

			int go = m - 1;
			for(int i = idx; i >= 0; i--) {
				if(a[i] == 1) {
					go = m - 1;
				}
				else if(go == 0) {
					a[i] = 1;
					cnt++;
					go = m -1;
				}
				else {
					go--;
				}
			}

			for(int i = idx; i < n; i++) {
				if(a[i] == 1) {
					go = m - 1;
				}
				else if(go == 0) {
					a[i] = 1;
					cnt++;
					go = m - 1;
				}
				else {
					go--;
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}