import java.util.Scanner;

public class SnowBalls {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// N number of snowballs
		// each snowball has 3 ints input:
		// 1) snow; 2) time; 3) quality;
		// value = snow/time times quality
		// print highest value

		int N = Integer.parseInt(scanner.nextLine());
		int bestSnow = Integer.MIN_VALUE;
		int bestTime = Integer.MIN_VALUE;
		int bestQuality = Integer.MIN_VALUE;
		double bestValue = Double.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			int snow = Integer.parseInt(scanner.nextLine());
			int time = Integer.parseInt(scanner.nextLine());
			int quality = Integer.parseInt(scanner.nextLine());
			double value = Math.pow((snow * 1.0 / time),quality);

			if (value > bestValue) {
				bestSnow = snow;
				bestTime = time;
				bestQuality = quality;
				bestValue = value;
			}
		}

		System.out.printf("%d : %d = %.0f (%d)%n", bestSnow, bestTime, bestValue, bestQuality);
	}
}





