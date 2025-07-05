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
            StringBuilder sb = new StringBuilder();
			String str = sc.next();
			for(char ch : str.toCharArray()){
				if (ch == 'b') {
					sb.append("d");
				} else if (ch == 'd') {
					sb.append("b");
				} else if (ch == 'p') {
					sb.append("q");
				} else if (ch == 'q') {
					sb.append("p");
				}
			}
			System.out.println("#" + test_case + " " + sb.reverse());
		}
	}
}