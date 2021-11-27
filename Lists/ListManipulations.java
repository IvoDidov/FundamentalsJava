import java.util.*;
import java.text.DecimalFormat;
import java.util.stream.Collectors;


public class ListManipulations {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
			
		List<String> command = Arrays.stream(scanner.nextLine().split(" "))
			.collect(Collectors.toList());
			
		while (!(command.get(0)).equals("end")) {
			switch(command.get(0)) {
				case "Add" : 
					int numToAdd = Integer.parseInt(command.get(1));
					nums.add(numToAdd);
				break;
				case "Remove" :
					int numToRemove = Integer.parseInt(command.get(1));
					nums.remove(Integer.valueOf(numToRemove));
				break;
				case "RemoveAt" :
					nums.remove(Integer.parseInt(command.get(1)));
				break;
				case "Insert" : 
					nums.add(Integer.parseInt(command.get(2)), Integer.parseInt(command.get(1)));
					
				break;
			}
			
			command = Arrays.stream(scanner.nextLine().split(" "))
			.collect(Collectors.toList());	
		}
		
		for( int i = 0; i < nums.size(); i++) {
				System.out.print(nums.get(i) + " ");
		}
		
	}	
}
