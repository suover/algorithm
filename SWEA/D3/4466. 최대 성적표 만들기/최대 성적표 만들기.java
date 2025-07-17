import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;

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
			int k = sc.nextInt();
			ArrayList <Integer> arrayList = new ArrayList<>();

			for(int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				arrayList.add(tmp);
			}

			arrayList.sort(Collections.reverseOrder());
			int sum = 0;
			for(int i = 0; i < k; i++) {
				sum += arrayList.get(i);
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}