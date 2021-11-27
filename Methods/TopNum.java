import java.util.Scanner;

public class TopNum {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);

		int n  = Integer.parseInt(scanner.nextLine());

		printTops(n);
	}

	private static void printTops(int n) {
		for (int i = 1; i <= n; i++) {
			if (div8(i)) {
				if (oneOdd(i)) {
					System.out.println(i);
				}
			}
		}
	}

	private static boolean div8(int n) {
		String num = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			sum += num.charAt(i);
		}
		if (sum % 8 == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	private static boolean oneOdd(int n) {
		String num = String.valueOf(n);
		boolean ok = false;
		for (int i = 0; i < num.length(); i++) {
			if ((num.charAt(i)-48) % 2 == 1) {
				ok = true;
				break;
			}
		}
		return ok;
	}
}



