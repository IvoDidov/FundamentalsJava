import java.util.Scanner;

public class Orders {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String product = scanner.nextLine();
		int quantity = Integer.parseInt(scanner.nextLine());

		calc(product, quantity);
	}

	private static void calc(String prod, int quant) {
		double price = 0;
		switch (prod) {
			case "coffee": price = 1.50;
						   break;
			case "water": price = 1;
						  break;
			case "coke": price = 1.4;
						 break;
			case "snacks": price = 2;
						   break;
		}
		double total = price * quant;
		System.out.printf("%.2f", total);
	}

}

