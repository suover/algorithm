import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        Set<Integer> set;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
			int count = 0;
			set = new HashSet<>();

			while(set.size() != 10){
				count++;
				int tmp = N * count;
				while(tmp != 0){
					set.add(tmp % 10);
					tmp /= 10;
				}
			}
			System.out.printf("#%d %d\n", test_case, count * N);
		}
	}
}