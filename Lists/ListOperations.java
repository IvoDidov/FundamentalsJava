import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
			
		String command = scanner.nextLine();
		while (!command.equals("End")) {
			String[] commandData = command.split("\\s+");
			
			switch (commandData[0]) {
				case "Add" : 
					list.add(Integer.parseInt(commandData[1]));
				break;
				
				case "Insert" : 
					int numToIns = Integer.parseInt(commandData[1]);
					int indexToIns = Integer.parseInt(commandData[2]);
					if (indexToIns >= 0 && indexToIns <= list.size() - 1) {
						list.add(indexToIns, numToIns);
					} else {
						System.out.println("Invalid index");
					}
				break;
				
				case "Remove" :
					int indexRemove = Integer.parseInt(commandData[1]);
					if (indexRemove >= 0 && indexRemove <= list.size() - 1) {
						list.remove(indexRemove);
					} else {
						System.out.println("Invalid index");
					}
				break;
				
				case "Shift" :
					int count = Integer.parseInt(commandData[2]);
					if (commandData[1].equals("left")) {
						for (int i = 0; i < count; i++) {
							int element = list.get(0);
							list.remove(0);
							list.add(element);
						}
					} else if (commandData[1].equals("right")) {
						for (int i = 0; i < count; i++) {
							int element = list.get(list.size()-1);
							list.remove(list.get(list.size()-1));
							list.add(0, element);
						}					
					}
				break;
			}
				
			
			
			command = scanner.nextLine();
		}
		
		for (int num : list) {
			System.out.print(num + " ");
		}
		
	}
}

