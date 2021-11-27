import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input1 = scanner.nextLine()
			.split(" ");
		int[] numbers1 = Arrays.stream(input1)
			.mapToInt(Integer::parseInt)
			.toArray();
		String[] input2 = scanner.nextLine()
			.split(" ");
		int[] numbers2 = Arrays.stream(input2)
			.mapToInt(Integer::parseInt)
			.toArray();

		boolean ident = true;
		for (int i = 0; i < numbers1.length; i++) {
			if (numbers1[i] != numbers2[i]) {
				System.out.printf("Arrays are not identical. Found difference at %d index.", i);
				ident = false;
				break;
			}
		}

		if (ident) {
			int sum = 0;
			for (int number : numbers1) {
				sum += number;
			}
			System.out.printf("Arrays are identical. Sum: %d",sum);
		}
	}
}

