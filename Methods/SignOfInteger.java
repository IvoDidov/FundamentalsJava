import java.util.Scanner;

public class SignOfInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = Integer.parseInt(scanner.nextLine());

		int positive = defineSign(number);
		printSign(positive,number);
	}

	private static int  defineSign(int n) {
		int positive;
		if (n > 0) {
			positive = 1;
		} else if (n<0) {
			positive = -1;
		} else {
			positive = 0;
		}
		return positive;
	}

	private static void printSign(int pos, int number) {
		if (pos == 0){
			System.out.println("The number 0 is zero.");
		} else if (pos == -1) {
			System.out.println("The number " + number + " is negative.");
		} else {
			System.out.println("The number " + number + " is positive.");
		}
	}
}


