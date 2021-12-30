import java.util.stream.Collectors;
import java.util.*;

public class CarRace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> track = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());

		int length = (track.size())/2;

		double time1 = 0;
		for (int i = 0; i < length; i++) {
			if (track.get(i) != 0) {
				time1 += track.get(i);
			} else {
				time1 = time1 * 0.8;
			}
		}

		double time2 = 0;
		for (int i = 0; i < length; i++) {
			if (track.get(track.size() -1 -i) != 0) {
				time2 += track.get(track.size() -1 -i);
			} else {
				time2 = time2 * 0.8;
			}
		}

		if (time1 < time2) {
			System.out.printf("The winner is left with total time: %.1f", time1);
		} else {
			System.out.printf("The winner is right with total time: %.1f", time2);
		}

	}
}
