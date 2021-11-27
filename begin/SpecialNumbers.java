import java.util.Scanner;

public class SpecialNumbers {
	public static void main(String[] args) {

// enter value n; for all numbers from 1 to n do:
// 1) if sum of digits 

		Scanner scanner = new Scanner(System.in);

		int key = Integer.parseInt(scanner.nextLine());
		int n = Integer.parseInt(scanner.nextLine());
		StringBuilder message = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String input = scanner.nextLine();
			char a = (char) ((int)input.charAt(0) + key);
			message.append(a);
		}
		String output = message.toString();
		System.out.println(output);
	}
}
