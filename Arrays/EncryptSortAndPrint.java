import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// take num of names = n
		// create a string array[n]
		// create a new int[n] array with values
		// sort int[] and print

		int n = Integer.parseInt(scanner.nextLine());

		String[] names = new String [n];
		int[] encrypted = new int [n];
		char[] vowels = {'A', 'E', 'U','O','I','a','e','u','i','o'};

		for (int i = 0; i < n; i++) {
			names[i] = scanner.nextLine();
			int sum = 0;
			for (int j = 0; j < names[i].length(); j++) {
				if (String.valueOf(vowels).contains(String.valueOf(names[i].charAt(j)))) {
					sum += names[i].charAt(j) * names[i].length();
				} else {
					sum += names[i].charAt(j) / names[i].length();
				}
			}

			encrypted[i] = sum;
		}

		Arrays.sort(encrypted);
		for (int value : encrypted) {
			System.out.println(value);
		}
	}
}

