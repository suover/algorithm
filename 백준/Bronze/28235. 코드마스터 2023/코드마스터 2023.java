import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		switch (s) {
			case "SONGDO":
				System.out.println("HIGHSCHOOL");
				break;
			case "CODE":
				System.out.println("MASTER");
				break;
			case "2023":
				System.out.println("0611");
				break;
			default:
				System.out.println("CONTEST");
				break;
		}
	}
}