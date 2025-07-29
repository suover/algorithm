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
            String number = Integer.toString(test_case);
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < number.length(); i++) {
				if (number.charAt(i) == '3' || number.charAt(i) == '6' || number.charAt(i) == '9') {
					result.append("-");
				}
			}
			if (result.length() >= 1) {
				System.out.print(result + " ");
			} else {
				System.out.print(number + " ");
			}
		}
	}
}