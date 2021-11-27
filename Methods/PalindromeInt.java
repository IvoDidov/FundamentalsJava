import java.util.Scanner;

public class PalindromeInt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		while(!input.equals("END")) {
			printIfP(input);


			input = scanner.nextLine();
		}
	}

	private static void printIfP(String str) {
		boolean pali = true;
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
				pali = false;
				break;
			}
		}
		if (pali) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	

}
