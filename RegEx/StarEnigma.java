package RegEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = Integer.parseInt(scanner.nextLine());
		List<String> planetsAttacked = new ArrayList<>();
		List<String> planetsDestroyed = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			String encryptedM = scanner.nextLine();
			String message = getSecretMessage(encryptedM);
			String planet = getPlanet(message);
			String action = getAction(message);
			boolean population = getPopulation(message);
			boolean soldiers = getSoldiers(message);
			if(population && soldiers) {
				if(action.equals("A")) {
					planetsAttacked.add(planet);
				} else if (action.equals("D")) {
					planetsDestroyed.add(planet);
				}
			}

		}

		Collections.sort(planetsAttacked);
		Collections.sort(planetsDestroyed);
		System.out.println("Attacked planets: " + planetsAttacked.size());
		planetsAttacked.stream().sorted()
				.forEach(e -> {
					if(!planetsAttacked.isEmpty()) {
						System.out.println("-> " + e);
					}
				});
		System.out.println("Destroyed planets: " + planetsDestroyed.size());
		planetsDestroyed.stream().sorted()
				.forEach(e -> {
					if(!planetsDestroyed.isEmpty()) {
						System.out.println("-> " + e);
					}
				});





	}


	private static String getSecretMessage(String encrMessage) {
		int count = 0;
		String regexEncrypted = "[SsTtAaRr]";
		Pattern encryptedPattern = Pattern.compile(regexEncrypted);
		Matcher matcher = encryptedPattern.matcher(encrMessage);
		while(matcher.find()) {
			count++;
		}

		StringBuilder messageBuilder = new StringBuilder();
		for (int j = 0; j < encrMessage.length(); j++) {
			char symb = encrMessage.charAt(j);
			messageBuilder.append((char)(symb - count));
		}
		return messageBuilder.toString();


	}

	private static String getPlanet(String message) {
		String regexPlanet = "@(?<planet>[a-zA-Z]+)[^@!>:-]*:(?<population>[0-9]+)[^@!>:-]*!(?<action>[AD])![^@!>:-]*->(?<sold>[0-9]+)";
		Pattern patternPlanet = Pattern.compile(regexPlanet);
		Matcher matcherPlanet = patternPlanet.matcher(message);
		String result = "";
		while(matcherPlanet.find()) {
			result =  matcherPlanet.group("planet");
			break;
		}

		return result;
	}

	private static String getAction(String message) {
		String regexPlanet = "@(?<planet>[a-zA-Z]+)[^@!>:-]*:(?<population>[0-9]+)[^@!>:-]*!(?<action>[AD])![^@!>:-]*->(?<sold>[0-9]+)";
		Pattern patternPlanet = Pattern.compile(regexPlanet);
		Matcher matcherPlanet = patternPlanet.matcher(message);
		String result = "";
		while(matcherPlanet.find()) {
			result =  matcherPlanet.group("action");
			break;
		}

		return result;
	}

	private static boolean getPopulation(String message) {
		String regexPlanet = "@(?<planet>[a-zA-Z]+)[^@!>:-]*:(?<population>[0-9]+)[^@!>:-]*!(?<action>[AD])![^@!>:-]*->(?<sold>[0-9]+)";
		Pattern patternPlanet = Pattern.compile(regexPlanet);
		Matcher matcherPlanet = patternPlanet.matcher(message);


		return matcherPlanet.find();
	}

	private static boolean getSoldiers(String message) {
		String regexPlanet = "@(?<planet>[a-zA-Z]+)[^@!>:-]*:(?<population>[0-9]+)[^@!>:-]*!(?<action>[AD])![^@!>:-]*->(?<sold>[0-9]+)";
		Pattern patternPlanet = Pattern.compile(regexPlanet);
		Matcher matcherPlanet = patternPlanet.matcher(message);


		return matcherPlanet.find();
	}


}
