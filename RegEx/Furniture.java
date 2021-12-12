package RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String regex = ">>(?<furniture>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)";
		String input = scanner.nextLine();
		Pattern pattern = Pattern.compile(regex);
		double totalSpent = 0;
		List<String> furnitures = new ArrayList<>();

		while(!input.equals("Purchase")) {

			Matcher furnMatcher = pattern.matcher(input);
			if(furnMatcher.find()) {
				String furniture = furnMatcher.group("furniture");
				double price = Double.parseDouble(furnMatcher.group("price"));
				int quantity = Integer.parseInt(furnMatcher.group("quantity"));
				furnitures.add(furniture);
				totalSpent += price * quantity;
				System.out.println();
			}
			input = scanner.nextLine();
		}

		System.out.println("Bought furniture:");
		furnitures.forEach(System.out::println);
		System.out.printf("Total money spend: %.2f", totalSpent);

	}
}
