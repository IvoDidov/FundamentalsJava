import java.util.Scanner;

public class BeerKegs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// take number of kegs = n
		int n = Integer.parseInt(scanner.nextLine());
		// set empty string for biggest keg && its volume
		String biggestKeg = "";
		double biggestVolume = Double.MIN_VALUE;

		// Take input for each keg && calc volume
		for (int i = 1; i <= n; i++) {
			String kegsName = scanner.nextLine();
			double radius = Double.parseDouble(scanner.nextLine());
			int height = Integer.parseInt(scanner.nextLine());
			double volume = Math.PI * Math.pow(radius, 2) * height;

			// check if volume beggier than last biggest
			if (volume > biggestVolume) {
				biggestVolume = volume;
				biggestKeg = kegsName;
			}
		}
		// print biggest keg
		System.out.println(biggestKeg);
	}
}


