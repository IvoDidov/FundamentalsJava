import java.util.*;
import java.util.stream.Collectors;

public class ChangeList {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
		
		List<String> command = Arrays.stream(scanner.nextLine().split(" "))
			.collect(Collectors.toList());
			
		while (!(command.get(0)).equals("end")) {			
			
			switch(command.get(0)) {
				case "Delete" : 
					int numToRemove = Integer.parseInt(command.get(1));
					List<Integer> removeList = List.of(numToRemove);
					list.removeAll(removeList);
				break;
				
				case "Insert" : 
					int numToAdd = Integer.parseInt(command.get(2));
					list.add((numToAdd), Integer.parseInt(command.get(1)));
				break;
				
			}
			
			command = Arrays.stream(scanner.nextLine().split(" "))
			.collect(Collectors.toList());
			
		}
		
		for (int num : list) {
			System.out.print(num + " ");
		}
		
		
	}
}
