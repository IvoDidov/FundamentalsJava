package Maps;

import java.util.*;

public class AMinerTask {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, Integer> resources = new LinkedHashMap<>();

		String resourceType = scanner.nextLine();

		while (!resourceType.equals("stop")) {
			int quantity = Integer.parseInt(scanner.nextLine());

			if (!resources.containsKey(resourceType)) {
				resources.put(resourceType, quantity);
			} else {
				resources.put(resourceType, resources.get(resourceType) + quantity);
			}

			resourceType = scanner.nextLine();
		}

		resources.forEach((k, v) -> System.out.println(k + " -> " + v));

	}
}
