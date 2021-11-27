import java.util.Scanner;

public class PrintNumbersInReverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// read number of elements = n to reverse
		// create an array with length n
		// put every input in the array
		// print in reverse order

		int n = Integer.parseInt(scanner.nextLine());	

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i]=Integer.parseInt(scanner.nextLine());
		}
		for (int i = n; i > 0; i--){
			System.out.println(numbers[i-1]);
		}
	}
}


