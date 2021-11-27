import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// take input and make an array with split of intervals
		String[] input = scanner.nextLine().split(" ");
		// make the int array "numbers" 
		// to be equal to the array of strings "input"
		int[] numbers = Arrays.stream(input)
			// make each string an integer (int)
			.mapToInt(Integer::parseInt)
			// make it an array again
			.toArray();
		int sumEven = 0;
		int sumOdd = 0;

		// for each element in the array "numbers
		for (int number : numbers) {
			// if the element int is even num
			if (number % 2 == 0) {
				sumEven += number;
			} else {
				sumOdd += number;
			}
		}

		System.out.println(sumEven-sumOdd);

	}
}



