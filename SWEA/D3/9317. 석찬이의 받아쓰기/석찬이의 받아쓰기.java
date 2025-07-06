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
			String s = sc.next();
			String cmp = sc.next();
			int cnt = 0;

			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == cmp.charAt(i))
					cnt++;
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}