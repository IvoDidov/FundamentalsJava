import java.util.*;
import java.util.stream.Collectors;

public class AnonymousThreat {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String namesInput = scanner.nextLine();
		List<String> names = Arrays.stream(namesInput
			.split("\\s+"))
			.collect(Collectors.toList());
		
		String command = scanner.nextLine();
			// merge {startIndex} {endIndex}
			// divide {index} {partitions}
		while(!command.equals("3:1")) {
			String[] commandData = command.split("\\s+");
			String commandName = commandData[0];
			if (commandName.equals("merge")) {
				int startIndex = Integer.parseInt(commandData[1]);
				int endIndex = Integer.parseInt(commandData[2]);
				// index validation
				if( startIndex < 0) {
					startIndex = 0;
				} else if (startIndex > names.size() -1) {
					startIndex = names.size() -1;
				}
				
				if (endIndex >= names.size()) {
					endIndex = names.size()-1;
				}
				// merging
				StringBuilder resultMerge = new StringBuilder();
				for (int i = startIndex; i <= endIndex; i++) {
					resultMerge.append(names.get(startIndex));
					names.remove(startIndex);
				}
				names.add(startIndex, resultMerge.toString());
				
				
			} else if (commandName.equals("divide")) {
				int oldIndex = Integer.parseInt(commandData[1]);
				int partitions = Integer.parseInt(commandData[2]);
				String elementToDivide = names.get(oldIndex);
				int elementSize = elementToDivide.length();
				int newListSize = elementSize / partitions;
				int extraElements = elementSize % partitions;
				List<String> newElementsArr = new ArrayList<>();
				
				for (int i = 0; i < partitions; i++) {
					StringBuilder newElement = new StringBuilder();
					for (int j = 0; j < newListSize; j++) {
						newElement.append(elementToDivide.charAt(i*newListSize + j));
						
					}
					newElementsArr.add(newElement.toString());
					
				}
				
				StringBuilder extraElementsString = new StringBuilder();
				extraElementsString.append(newElementsArr.get(newElementsArr.size()-1));
				for (int i = 0; i < extraElements; i++) {
					extraElementsString.append(elementToDivide.charAt(elementSize - extraElements +i));
				}
				newElementsArr.remove(newElementsArr.size()-1);
				newElementsArr.add(newElementsArr.size(), extraElementsString.toString());
				names.remove(oldIndex);
				names.addAll(oldIndex, newElementsArr);
			}
			
			
			
			
			
			
			command = scanner.nextLine();
		}
		
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.print(name + " ");
		}
		
	}
	
}




