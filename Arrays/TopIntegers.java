import java.util.Scanner;
import java.util.Arrays;

public class TopIntegers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// take the array
		int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();

		// first loop for all nums
		for (int i = 0; i < numbers.length; i++) {
			boolean top = true;
			// second for the rest in right
			// starts at [+1]
			// does not check last because 1 is == (length-i)
			for (int j = 1 ; j < numbers.length -i; j++) {
				if (numbers[i] < numbers[i+j]) {
					top = false;
					break;
				}   
			}
			if (top) {
			System.out.print(numbers[i] + " ");
			}
		}
	}
}
