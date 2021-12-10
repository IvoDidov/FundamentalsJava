package Maps;

import java.util.*;

public class LegendaryFarming {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, Integer> keyMaterials = new HashMap<>();
		Map<String, Integer> junk = new HashMap<>();
		keyMaterials.put("shards",0);
		keyMaterials.put("fragments", 0);
		keyMaterials.put("motes", 0);
		boolean Shadowmourne = false;
		boolean Valanyr = false;
		boolean Dragonwrath = false;
		boolean end = false;

		while (!end) {
			String[] input = scanner.nextLine().split(" ");
			String material = "";
			int quantity = 0;
			for (int i = 0; i < input.length; ++i) {
				if (i % 2 != 0) {
					material = input[i].toLowerCase();
				} else {
					quantity = Integer.parseInt(input[i]);
					continue;
				}

				// 1) if keyMaterial
				if ("shards".equals(material) || "fragments".equals(material) || "motes".equals(material)) {

					keyMaterials.put(material, keyMaterials.get(material) + quantity);

					// if any keyMaterial => 250 -> end
					if (keyMaterials.get("shards") >= 250) {
						end = true;
						Shadowmourne = true;
						keyMaterials.put("shards", keyMaterials.get("shards") -250);
						break;
					} else if ( keyMaterials.get("fragments") >= 250  ) {
						end = true;
						Valanyr = true;
						keyMaterials.put("fragments", keyMaterials.get("fragments") -250);
						break;
					} else if (keyMaterials.get("motes")  >= 250) {
						end = true;
						Dragonwrath = true;
						keyMaterials.put("motes", keyMaterials.get("motes") -250);
						break;
					}
				// 2) if junk ->
				} else {
					if (junk.containsKey(material)) {
						junk.put(material, junk.get(material) + quantity);
					} else {
						junk.put(material, quantity);
					}
				}

			}

		}

		if (Shadowmourne) {
			System.out.println("Shadowmourne obtained!");
		} else if (Valanyr) {
			System.out.println("Valanyr obtained!");
		}else if (Dragonwrath) {
			System.out.println("Dragonwrath obtained!");
		}

		// key 1) by value in descending
		// 2) by name in ascending
		keyMaterials.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
				.thenComparing(Map.Entry.comparingByKey()))
				.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

		junk.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByKey())
				.forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));





	}
}
