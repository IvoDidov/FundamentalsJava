import java.util.Scanner;
import java.util.Arrays;

public class ArrayRotation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// input Array of ints
		// input number of shifts
		// shift == first element goes last && rest moves one in left;
		// take element[0] value to temp holder
		// shift rest one in left
		// last becomes first from temp value

		// take the array and make it in ints
		int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();
		int testNumber = 1234567890;
		String str = "Test String";

		// take the number os shifts
		int numOfShifts = Integer.parseInt(scanner.nextLine());
		// if shifts more than elements in array
		if (numOfShifts > numbers.length) {
			numOfShifts = numOfShifts % numbers.length;
		}

		// make a new temp holder array and fill it with the shifted elements
		int[] holder = new int[numOfShifts];
		for (int i = 0; i < numOfShifts; i++) {
			holder[i] = numbers[i];  //444
		}
		
		/*
		 */

		// move the rest of elements to start from [0]
		for (int i = 0; i < numbers.length  - numOfShifts; i++) {
			numbers[i] = numbers[numOfShifts + i];
		}

		// fill the last positions with temp holder
		for (int i = 0; i < numOfShifts; i++) {
			numbers[numbers.length - numOfShifts + i] = holder[i];
		}

		for (int num : numbers) {
			System.out.print(num + " ");
		}

	}
}

