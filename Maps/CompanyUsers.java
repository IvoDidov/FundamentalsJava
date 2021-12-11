package Maps;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;

public class CompanyUsers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Map<String, List<String>> companysEmp = new HashMap<>();

		while(!input.equals("End")) {
			String[] command = input.split(" -> ");
			List<String> employees = new ArrayList<>();
			String company = command[0];
			String employee = command[1];

			// company new/exists
				// employee new/exists
			if (companysEmp.containsKey(company)) { // company exists
				// employee new/exists in current company
				if (!companysEmp.get(company).contains(employee)) { // employee new
					companysEmp.get(company).add(employee);
				}
			} else { // company new (employee new)
				employees.add(employee);
				companysEmp.put(company, employees);
			}

			input = scanner.nextLine();
		}

		// order by name ascending
		companysEmp.entrySet().stream()
				.sorted(Map.Entry.comparingByKey()) // sort by name
				.forEach(e -> { // for each element (string+list<str>)
					// e is an element in map. e = (key, value)
					System.out.println(e.getKey()); // print key(string)
					// take value from each element
					e.getValue()
							// following sort was unwanted , but works
							//.stream()
							//.sorted().collect(Collectors.toList()) // sort value (list<str>) by name
							// for each name in current list<str> print name
							.forEach(emp -> System.out.println("-- " + emp));
				});



	}
}

