import java.util.Scanner;

public class RepeatString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		int repeats = Integer.parseInt(scanner.nextLine());

		String output = repeatString(str, repeats);
		System.out.println(output);
	}

	private static String repeatString(String str, int n) {
		StringBuilder newString = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			newString.append(str);
		}
		return newString.toString();
	}

}

