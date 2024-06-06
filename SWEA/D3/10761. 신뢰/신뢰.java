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
			int N = sc.nextInt(); // 버튼의 개수
			String[] actions = new String[N * 2];

			for (int i = 0; i < N * 2; i++) {
				actions[i] = sc.next();
			}

			int orangePos = 1; // 오렌지 로봇의 현재 위치
			int bluePos = 1; // 블루 로봇의 현재 위치
			int time = 0; // 총 걸린 시간
			int orangeTime = 0; // 오렌지 로봇이 버튼을 누르기까지 걸린 시간
			int blueTime = 0; // 블루 로봇이 버튼을 누르기까지 걸린 시간

			for (int i = 0; i < N * 2; i += 2) {
				String robot = actions[i];
				int target = Integer.parseInt(actions[i + 1]);

				if (robot.equals("O")) {
					int moveTime = Math.abs(target - orangePos) + 1;
					orangeTime += moveTime;
					if (orangeTime > time) {
						time = orangeTime;
					} else {
						time++;
						orangeTime = time;
					}
					orangePos = target;
				} else if (robot.equals("B")) {
					int moveTime = Math.abs(target - bluePos) + 1;
					blueTime += moveTime;
					if (blueTime > time) {
						time = blueTime;
					} else {
						time++;
						blueTime = time;
					}
					bluePos = target;
				}
			}
			System.out.println("#" + test_case + " " + time);
		}
		sc.close();
	}
}