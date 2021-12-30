import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_lists_lab_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
				.map(Integer::parseInt)
				.collect(Collectors.toList());

		int length = Math.max(firstList.size(), secondList.size());
		for (int i = 0; i < length; i++) {
			if (i < firstList.size()) {
				System.out.print(firstList.get(i) + " " );
			}
			if (i < secondList.size() ) {
				System.out.print( secondList.get(i) + " ");
			}
		}


	}
}
