import java.util.Scanner;

public class MiddleChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		printMid(input);

	}

	private static void printMid(String str) {
		StringBuilder string = new StringBuilder();
		if (str.length() % 2 != 0) {
			string.append(str.charAt(str.length()/2));
		} else {
			string.append(str.charAt(str.length() / 2 -1));
			 string.append(str.charAt(str.length()/2));
		}
		System.out.println(string.toString());
	}

}


