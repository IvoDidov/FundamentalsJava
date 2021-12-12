package RegEx;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";
		String input = scanner.nextLine();

		Pattern pattern = Pattern.compile(regex);
		Matcher phoneMatcher = pattern.matcher(input);


		List<String> matches = new LinkedList<>();
		while (phoneMatcher.find()) {
			matches.add(phoneMatcher.group());
		}

		System.out.println(String.join(", ", matches));

	}
}

