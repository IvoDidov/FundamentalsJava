import java.util.Scanner;

public class CharactersInRange {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		char start = scanner.nextLine().charAt(0);
		char end = scanner.nextLine().charAt(0);

		printChars(start, end);
	}

	private static void printChars(char st, char end) {
		if (st > end) {
			char x = st;
			st = end;
			end = x;
		}

		for (int i = st+1; i < end; i++) {
			System.out.print((char)i + " ");
		}
	}
}

