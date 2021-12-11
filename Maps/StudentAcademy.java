package Maps;

import java.util.*;

public class StudentAcademy {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, List<Double>> students = new LinkedHashMap<>();
		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine();
			double grade = Double.parseDouble(scanner.nextLine());
			//if student exists
			if (students.containsKey(name)) {
				students.get(name).add(grade);
			// if new student
			} else {
				List<Double> grades = new ArrayList<>();
				grades.add(grade);
				students.put(name, grades);
			}
		}

		// new map: k- student; v- average grade
		// if avg. grade < 4.50 -> remove
		// sort by grade descending (9->1)

		Map<String, Double> studentsAvg = new LinkedHashMap<>();
		students.forEach((k,v) -> {
			double average = 0;
			int count = 0;
			for (Double aDouble : v) {
				average += aDouble;
				count++;
			}
			average = average / count;
			if (average >= 4.5) {
				studentsAvg.put(k, average);
			}
		});
		studentsAvg.entrySet().stream()
				.sorted(Map.Entry.<String,Double>comparingByValue().reversed())
				.forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()) );


	}
}
