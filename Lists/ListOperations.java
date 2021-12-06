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
			String[] commandData = command.split(" ");
			
			switch (commandData[0]) {
				case "Add" : 
					list.add(Integer.parseInt(commandData[1]));
				break;
				
				case "Insert" : 
					int numToAdd = Integer.parseInt(commandData[1]);
					int indexToAdd = Integer.parseInt(commandData[2]);
					if ()
				break;
				
				case "Remove" :
				
				break;
				
				case "Shift" :
					if (commandData[1].equals("left")) {
						
					} else if (commandData[1].equals("right")) {
						
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
