import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// create an int array from input
		// make two for loops
		// 1) loop as many times as there are elements in the array, but -1;
		// 2.1) sum every element with the next except position [0] 
		// 2.2) && every last element becomes 0 (except [0])

		String[] input = scanner.nextLine().split(" ");
		int[] numbers = Arrays.stream(input)
			.mapToInt(Integer::parseInt)
			.toArray();

		// start both loops
		for (int j = 0; j <= numbers.length -1; j++) {
			// next loop is until length -2 because adding +1 in loop
			for (int i = 0; i <= numbers.length -2 -j; i++) {
				// add all numbers
				numbers[i] += numbers[i+1];
			}
			// if element not position [0] 
			/*
			if (numbers.length -1 -j != 0) {
			numbers[numbers.length -1 -j]=0;
			}
			*/
		}
		System.out.println(numbers[0]);
	}
}

