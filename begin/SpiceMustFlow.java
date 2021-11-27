import java.util.Scanner;

public class SpiceMustFlow {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int yield = Integer.parseInt(scanner.nextLine());
		int daysMined = 0;
		int minedSpice = 0;

		while (yield >= 100) {
			daysMined++;
			minedSpice = minedSpice + yield - 26;
			yield -= 10;
		}
		if (minedSpice >= 26) {
			minedSpice -= 26;
		}

		System.out.println(daysMined);
		System.out.println(minedSpice);
	}
}

