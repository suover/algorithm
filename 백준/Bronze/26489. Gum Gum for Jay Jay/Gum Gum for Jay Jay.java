import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		while (true) {
			String tmp = br.readLine();
			if (tmp == null) break;
			cnt++;
		}
		System.out.println(cnt);
	}
}
