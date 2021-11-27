import java.util.Scanner;

public class VowelsCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		System.out.println(countVowels(input));
	}

	private static int countVowels(String str) {
		char[] vowels = new char[] {'a','e','i','u','o','A','E','I','O','U'};
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			for (char x : vowels) {
				if (x == str.charAt(i)) {
					sum++;
					break;
				}
			}
		}
		return sum;
	}
}
