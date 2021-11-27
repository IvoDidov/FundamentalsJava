import java.util.Scanner;

public class NxNMatrix {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());

		printNxN(n);
	}

	private static void printNxN(int n) {
		for (int i = 0; i < n; i++) {
			printLineN(n);
			System.out.println();
		}
	}

	private static void printLineN(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(n + " ");
		}
	}

}
