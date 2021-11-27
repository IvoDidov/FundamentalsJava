import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
			.mapToInt(Integer::parseInt).toArray();

		boolean notFound = true;

		for (int i = 0; i < numbers.length; i++) {
			int leftSum = 0;
			int rightSum = 0;
			for (int j = 0; j < i; j++) {
				leftSum += numbers[j];
			}
			for (int h = i+1; h < numbers.length; h++) {
				rightSum += numbers[h];
			}
			if (leftSum == rightSum) {
				System.out.print(i);
				notFound = false;
				break;
			}
		}

		if (notFound) {
			System.out.print("no");
		}
	}
}

