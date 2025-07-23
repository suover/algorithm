import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arr = new int[N];
			int result = -1;
			for(int i = 0; i < N; i++){
				arr[i] = sc.nextInt();
			}
			for(int i = 0; i < N - 1; i ++){
				for(int j = i + 1; j < N; j++){
					if(M >= arr[i] + arr[j]){
						result = Math.max(result, arr[i] + arr[j]);
					}
				}
			}
			System.out.printf("#%d %d%n", test_case, result);
		}
	}
}