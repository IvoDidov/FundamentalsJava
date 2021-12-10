package Maps;

import java.util.*;

public class SoftUniExamResults {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Map<String, Integer> students = new HashMap<>();
		Map<String, Integer> languages = new HashMap<>();

		String input = scanner.nextLine();

		while(!input.equals("exam finished")) {
			String[] command = input.split("-");

			String name ;
			Integer points =0;
			String language ;

			if (command.length >= 3) {
				 name = command[0];
				 points = Integer.parseInt(command[2]);
				 language = command[1];
			} else {
				name = command[0];
				language = command[1];
			}

			// check of student is banned
			if (command[1].equals("banned")) {
				students.remove(name);
			} else {
				// if student exists
				if (students.containsKey(name)) {
					// if current points are less!
					if (students.get(name) < points) {
						students.put(name, points);
					}
				} else {
					// if new student
					students.put(name, points);
				}

				// if language exists
				if (languages.containsKey(language)) {
					languages.put(command[1], languages.get(language) + 1);
				} else {
					languages.put(language, 1);
				}
			}


			input = scanner.nextLine();
		}

		System.out.println("Results:");
		students.entrySet().stream()
				.sorted(Map.Entry.<String, Integer> comparingByValue().reversed()
				.thenComparing(Map.Entry.comparingByKey()))
				.forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

		System.out.println("Submissions:");
		languages.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
				.thenComparing(Map.Entry.comparingByKey()))
				.forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));




	/*			forEach((k,v) -> {
			System.out.printf("%s|%d%n",k, v);
		});

		System.out.println("Submissions:");
		students.forEach((k,v) -> {
			System.out.printf("%s-%d%n",k, v);
		});*/


	}
}
