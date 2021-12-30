import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_list_exc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
				.map(Integer::parseInt).collect(Collectors.toList());
		String command = scanner.nextLine();

		while (!command.equals("End")) {
			String[] commandData = command.split("\\s+");
			String commandName = commandData[0];
			switch(commandName) {
				case "Add":
					int numberToAdd = Integer.parseInt(commandData[1]);
					numbers.add(numberToAdd);
					break;
				case "Insert":
					int numberToInsert = Integer.parseInt(commandData[1]);
					int insertIndex = Integer.parseInt(commandData[2]);
					if (isValidIndex(insertIndex, numbers.size())) {
						numbers.add(insertIndex, numberToInsert);
					}else {
						System.out.println("Invalid index");
					}
					break;
				case "Remove":
					int removedIndex = Integer.parseInt(commandData[1]);
					if(isValidIndex(removedIndex, numbers.size())) {
						numbers.remove(removedIndex);
					} else {
						System.out.println("Invalid index");
					}
					break;
				case "Shift":
					String shiftType = commandData[1];
					int commandRepetition = Integer.parseInt(commandData[2]);
					if (shiftType.equals("left")){
						shiftLeft(numbers, commandRepetition);
					} else if (shiftType.equals("right")) {
						shiftRight(numbers, commandRepetition);
					}
					break;
			}

			command = scanner.nextLine();
		}

		for (int number : numbers) {
			System.out.print(number + " ");
		}

	}

	private static void shiftRight(List<Integer> numbers, int commandRepetition) {
		for (int i = 0; i < commandRepetition; i++) {
			int  lastNumber = numbers.get(numbers.size()-1);
			numbers.add(0,numbers.get(numbers.size() - 1));
			numbers.remove(numbers.size()-1);
		}
	}

	private static void shiftLeft(List<Integer> numbers, int count) {
		for (int i = 0; i < count; i++) {
			int firstNumber = numbers.get(0);
			numbers.add(firstNumber);
			numbers.remove(0);
		}
	}

	public static boolean isValidIndex(int index, int size) {
		return index >=0 && index <= size -1;
	}
}
