package RegEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regexName = "[A-Za-z]+";
		String regexDist = "[0-9]";

		Pattern patternName = Pattern.compile(regexName);
		Pattern patternDist = Pattern.compile(regexDist);
		List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
		Map<String, Integer> racersDist = new LinkedHashMap<>();
		racers.forEach(racer -> racersDist.put(racer, 0));

		String input = scanner.nextLine();

		while (!input.equals("end of race")) {
			Matcher matcherName = patternName.matcher(input);
			Matcher matcherDist = patternDist.matcher(input);
			StringBuilder nameBuilder = new StringBuilder();

			int distance = 0;

			while(matcherName.find()){
				nameBuilder.append(matcherName.group());
			}
			String name = nameBuilder.toString();

			while(matcherDist.find()){
				distance += Integer.parseInt(matcherDist.group());
			}
			if (racersDist.containsKey(name)) {
					racersDist.put(name, racersDist.get(name) + distance);
			}
			input = scanner.nextLine();
		}


		List<String> topThree = racersDist.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.limit(3)
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

//		topThree.forEach(System.out::println);

		System.out.println("1st place: " + topThree.get(0));
		System.out.println("2nd place: " + topThree.get(1));
		System.out.println("3rd place: " + topThree.get(2));

	}
}
