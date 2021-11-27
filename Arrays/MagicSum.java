import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int [] numbers = Arrays.stream(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

		int magic = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				if (sum == magic) {
					System.out.print(numbers[i] + " " + numbers[j]);
					System.out.println();
				}
			}
		}
	}
}

