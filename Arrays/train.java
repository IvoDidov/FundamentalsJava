import java.util.Scanner;

public class train {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfWagons = Integer.parseInt(scanner.nextLine());
		int[] people = new int[numberOfWagons];

		for (int i = 0; i < numberOfWagons; i++) {
			people[i] = Integer.parseInt(scanner.nextLine());
		}

		int sum =0;
		for (int number : people) {
			System.out.print(number + " ");
			sum += number;
		}

		System.out.printf("%n%d",sum);
	}
}

