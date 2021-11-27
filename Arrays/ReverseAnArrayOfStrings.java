import java.util.Scanner;

public class ReverseAnArrayOfStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// take input an make ana array by split of " "
		String[] inputArray = scanner.nextLine().split(" ");

		// make new array of reversed inputArray
		String[] outputArray = new String[inputArray.length];
		for (int i = 0; i < inputArray.length; i++) {
			outputArray[i] = inputArray[inputArray.length - 1 - i];
		}
		for (int i = 0; i < outputArray.length; i++) {
				System.out.print(outputArray[i] + " ");
		}

	}
}
