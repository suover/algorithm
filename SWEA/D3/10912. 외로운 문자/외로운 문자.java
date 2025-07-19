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
			int[] nums = new int[26];
			for(char ch : str.toCharArray()) {
				nums[ch - 'a']++;
			}
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 26; i++){
				if(nums[i] % 2 != 0){
					sb.append((char)('a' + i));
				}
			}
			if(sb.toString().isEmpty()) {
				System.out.println("#" + test_case + " Good");
			} else {
				System.out.println("#" + test_case + " " + sb);
			}
		}
	}
}