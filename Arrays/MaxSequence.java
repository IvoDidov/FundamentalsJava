import java.util.Scanner;
import java.util.Arrays;

public class MaxSequence {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::parseInt)
			.toArray();

		int topLength = 0;
		int topStart = 0;

		for (int i = 0; i < numbers.length -1; i++) {
			int counter = 1;
			while (numbers[i] == numbers[i+counter]) {
				counter++;
				if (i+counter >= numbers.length) {
					break;
				}
			}
			if (counter > topLength) {
			topLength = counter;
			topStart = i;
			}
		}
		for (int i =0; i < topLength; i++) {
			System.out.print(numbers[topStart+i] + " ");
		}
	}
}

