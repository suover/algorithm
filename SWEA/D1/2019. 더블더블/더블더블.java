import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int num = 1;
		for (int i = 0; i <= n; i++) {
			System.out.print(num + " ");
			num *= 2;
		}
	}
}