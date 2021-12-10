package Maps;

import java.util.*;

public class Orders {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input = scanner.nextLine().split(" ");

		Map<String, Double> productsQuantity = new LinkedHashMap<>();
		Map<String, Double> productsPrice = new LinkedHashMap<>();

		while (!input[0].equals("buy")) {
			String productsType = input[0];
			double price = Double.parseDouble(input[1]);
			double quantity = Double.parseDouble(input[2]);

			if (!productsPrice.containsKey(productsType)) {
				productsPrice.put(productsType, price);
				productsQuantity.put(productsType, quantity);
			} else {
				productsPrice.put(productsType, price);
				productsQuantity.put(productsType, productsQuantity.get(productsType) + quantity);
			}

			input = scanner.nextLine().split(" ");
		}

		productsQuantity.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v*(productsPrice.get(k))));

	}
}
