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
            String S = sc.next();

			int mid = S.length() / 2;
			boolean ok = isPalindrome(S)
				&& isPalindrome(S.substring(0, mid))
				&& isPalindrome(S.substring(mid + 1));

			System.out.printf("#%d %s\n", test_case, ok ? "YES" : "NO");
		}
	}
    	private static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i++) != s.charAt(j--)) {
				return false;
			}
		}
		return true;
	}
}