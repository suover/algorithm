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
			int A = sc.nextInt();
			int B = sc.nextInt();
			int count = 0;

			for (int i = A; i <= B; i++) {
				if (isPalindrome(i)) {
					int sqrt = (int) Math.sqrt(i);
					if (sqrt * sqrt == i && isPalindrome(sqrt)) {
						count++;
					}
				}
			}
			System.out.println("#" + test_case + " " + count);
		}
	}

	public static boolean isPalindrome(int num) {
		String str = Integer.toString(num);
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}