import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> hashSet = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			hashSet.add(scanner.nextInt() % 42);
		}

		System.out.print(hashSet.size());
	}
}