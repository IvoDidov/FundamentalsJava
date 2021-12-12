package RegEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regexEmail = "\\s(?<user>(?<prefix>[a-zA-Z0-9]+[\\._-])*(?<usermain>[a-zA-Z0-9]+))@(?<host>(?<host1>[a-zA-Z0-9]+[\\.-]+)*(?<host2>[a-zA-Z0-9]+))\\.(?<country>[a-zA-Z0-9]+)";
		Pattern patternMail = Pattern.compile(regexEmail);
		String input = scanner.nextLine();



			Matcher matcher = patternMail.matcher(input);
			while (matcher.find()) {
				System.out.println(matcher.group().trim());
			}

		}

	}

