package Maps;

import java.util.*;

public class OddOccurences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, Integer> words = new LinkedHashMap<>();

		String[] input = scanner.nextLine().split(" ");

		for (String s : input) {
			String word = s.toLowerCase();
			if (!words.containsKey(word)) {
				words.put(word, 1);
			} else {
				words.put(word, words.get(word) + 1);
			}

		}

		ArrayList<String> odds = new ArrayList<>();
		for (Map.Entry<String, Integer> entry : words.entrySet()) {
			if(entry.getValue() % 2 == 1) {
				odds.add(entry.getKey());
			}
		}


		for (int i = 0; i <	odds.size() ; i++) {
			System.out.print(odds.get(i));
			if (i < odds.size() -1) {
				System.out.print(", ");
			}
		}

	}
}
