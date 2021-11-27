import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
	public static void main(String[] qrgs) {
		Scanner scanner = new Scanner(System.in);

		int numInput = Integer.parseInt(scanner.nextLine());
		int[] numbers1 = new int[numInput];
		int[] numbers2 = new int[numInput];

		for (int i = 0; i < numInput; i++) {
			int[] input = Arrays.stream(scanner.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();

			if ((i+1)%2 != 0) {
				numbers1[i] = input[0];
				numbers2[i] = input[1];
			} else {
				numbers1[i] = input[1];
				numbers2[i] = input[0];
			}
		}

		for (int number : numbers1) {
			System.out.print(number + " ");
		}
		System.out.println();

		for (int number : numbers2) {
			System.out.print(number + " ");
		}
	}
}

