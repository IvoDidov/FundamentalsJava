package exam;

import java.util.*;
import java.util.stream.Collectors;


public class BattleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Map<String, Integer> personsHth = new HashMap<>();
		Map<String, Integer> personsNrg = new HashMap<>();

		while(!input.equals("Results")) {
			String[] command = input.split(":");
			String action = command[0];
			switch (action) {
				case "Add": // name, health, nrg
					// if name new -> add person health and energy
					// if exists -> add health and engr
				String name = command[1];
				Integer health = Integer.parseInt(command[2]);
				Integer energy = Integer.parseInt(command[3]);
					if (!personsHth.containsKey(name)){
						personsHth.put(name, health);
						personsNrg.put(name, energy);
					} else {
						personsHth.put(name, (personsHth.get(name) + health));

					}

					break;
				case "Attack": // attacker, defender, damage
					// defender health -= damage; attacker nrg -=1
					// if defndr health  or attacker nrg <= 0 ->  name disqual
					String attacker = command[1];
					String defender = command[2];
					Integer defenderH = personsHth.get(defender);
					Integer attackerN = personsNrg.get(attacker);
					int damage = Integer.parseInt(command[3]);
					if(personsHth.containsKey(attacker) && personsHth.containsKey(defender)){
						defenderH -= damage;
						if(defenderH <= 0){
							personsHth.remove(defender);
							personsNrg.remove(defender);
							System.out.println(defender + " was disqualified!");
						} else {
							personsHth.put(defender, defenderH);
						}
						// attacker energy
						attackerN--;

						if (attackerN <= 0){
							personsHth.remove(attacker);
							personsNrg.remove(attacker);
							System.out.println(attacker + " was disqualified!");
						} else {
							personsNrg.put(attacker, attackerN);
						}

					}

					break;
				case "Delete":
					if (command[1].equals("All")) {
						//remove all
						personsHth.clear();
						personsNrg.clear();
					} else {
						// remove name
						String nameToDelete = command[1];
						personsHth.remove(nameToDelete);
						personsNrg.remove(nameToDelete);
					}
					break;


			}
			input = scanner.nextLine();
		}

		// print count of people
		System.out.println("People count: " + personsHth.size());
		// print each person
		List<String> persons = personsHth.entrySet().stream()
				.sorted((entry1, entry2) -> {
					int health1 = entry1.getValue();
					String name1 = entry1.getKey();
					int health2 = entry2.getValue();
					String name2 = entry2.getKey();
					if (health1 != health2) {
						return Integer.compare(health2, health1);
					} else {
						return name1.compareTo(name2);
					}
				}).map(entry -> entry.getKey())
				.collect(Collectors.toList());


/*				.entrySet().stream()
				.sorted((person1 ,person2) -> {
					int health1 = person1.getValue();
					int health2 = person2.getValue();
					String name1 = person1.getKey();
					String name2 = person2.getKey();
					if(health1 != health2) {
						return Integer.compare()
					}
				}
				.map(entry -> entry.getKey())
				.collect(Collectors.toList()));*/

		for (String person : persons) {
			System.out.printf("%s - %d - %d%n",
					person, personsHth.get(person), personsNrg.get(person));

		}

	}



}
