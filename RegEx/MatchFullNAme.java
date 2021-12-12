package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullNAme {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String regex = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
		String input = scanner.nextLine();

		Pattern pat = Pattern.compile(regex);
		Matcher matcher = pat.matcher(input);

		while (matcher.find()) {
			System.out.print(matcher.group() + " ");
		}

	}
}
