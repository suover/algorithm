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
			int distance = 0;
			int acc = 0;
			for(int i = 0; i < n; i++) {
				int op = sc.nextInt();
				if(op == 1)
					acc += sc.nextInt();
				else if(op == 2) {
					int sub = sc.nextInt();
					if(sub > acc) {
						acc = 0;
					} else {
						acc -= sub;
					}
				}
				distance += acc;
			}
			System.out.println("#" + test_case + " " + distance);
		}
	}
}