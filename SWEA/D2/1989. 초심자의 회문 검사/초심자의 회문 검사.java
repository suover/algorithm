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
            String str = sc.next();
			String reverseStr = new StringBuilder(str).reverse().toString();
			int result = (str.equals(reverseStr)) ? 1 : 0;

			System.out.println("#" + test_case + " " + result);
		}
	}
}