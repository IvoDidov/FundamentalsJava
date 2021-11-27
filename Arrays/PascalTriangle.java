import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// start with 1
		// first is 1, last is 1
		// rest is above + above left

		//take num of rows
		int numOfRows = Integer.parseInt(scanner.nextLine());

		// first row is always "1"
		int [] previousRow = {1};
		System.out.println(previousRow[0]);
		
		// for loop creating rest of rows
		for (int i = 1; i < numOfRows; i++) {
			int [] row = new int[i+1];

			row[0] = 1; // first is 1
			row[i] = 1; // last is 1

			// next loop starts at third row
			for (int j = 1; j < row.length -1 ; j++) {
				row[j] = previousRow[j] + previousRow[j-1];
			}

			// printing current row
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println(); // got to new line
			previousRow = row; // current row becomes previous
		}
	}
}

