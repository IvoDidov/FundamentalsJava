package Maps;

import java.util.*;
import java.util.stream.Collectors;

public class Courses {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Map<String, List<String>> courses = new LinkedHashMap<>();

		while (!input.equals("end")) {
			String[] command = input.split(" : ");

			List<String> students = new ArrayList<>();
			String course = command[0];
			String student = command[1];


			if (!courses.containsKey(course)) {
				courses.put(course, students);
			}
				courses.get(course).add(student);

			input = scanner.nextLine();
		}

/*		courses.forEach((k, v) -> {
			int members = v.size();
			System.out.printf("%s: %d%n", k, members);
			v.forEach(name -> System.out.printf("-- %s%n",name));
		});*/

		courses.entrySet().stream()
				.sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
				.forEach(e -> {
					int members = e.getValue().size();
					System.out.println( e.getKey()+ ": " + members);
					e.getValue()
							.stream().sorted(String::compareTo)
							.forEach(name -> System.out.println("-- " +name));
				});

	}
}
