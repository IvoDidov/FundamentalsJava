package RegEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String regex = "\\b(?<day>[\\d]{2})([-.\\/])(?<month>[A-Z][a-z]{2})\\2(?<year>[\\d]{4})\\b";
		String input = scanner.nextLine();

		Pattern pattern = Pattern.compile(regex);
		Matcher dateMatcher = pattern.matcher(input);



		while (dateMatcher.find()) {
//			System.out.print(dateMatcher.group() + " ");

			String day = dateMatcher.group("day");
			String month = dateMatcher.group("month");
			String year = dateMatcher.group("year");

			System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);

		}




	}
}
