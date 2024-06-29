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
			int theta = sc.nextInt();

			// 시와 분 계산
			int hour = theta / 30;
			int minutes = (theta % 30) * 2;

			// 12시는 0시로 출력
			if (hour == 12) {
				hour = 0;
			}

			System.out.printf("#%d %d %d%n", test_case, hour, minutes);
		}
	}
}