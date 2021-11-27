import java.util.Scanner;

public class PrintingTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rows = Integer.parseInt(scanner.nextLine());

		printTriangle(rows);
	}

	private static void printTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			printRowAscend(i);
		}
		
		for (int j = rows; j > 1; j--) {
			printRowDescend(j);
		}
	}

	private static void printRowAscend(int nums) {
		for (int i = 1; i <= nums; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

	private static void printRowDescend(int nums) {
		for (int i = 1; i < nums; i ++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
