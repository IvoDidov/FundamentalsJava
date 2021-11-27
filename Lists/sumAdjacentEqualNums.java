import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class sumAdjacentEqualNums {
	public static void main(String[] Args) {
		
		Scanner scanner = new Scanner(System.in);
	
		String[] userInput = scanner.nextLine().split(" ");
		
	/* long method for making a list from String input
		List<Double> numberList = new ArrayList<>();
		for (String stringNumber : userInput) {
			numberList.add(Double.parseDouble(stringNumber));
		}
	*/
		
		List<Double> numberList = Arrays.stream(userInput)
			.map(Double::parseDouble)
			.collect(Collectors.toList());
			
		for (int i = 0; i < numberList.size() - 1; i++) {
			if (numberList.get(i).equals(numberList.get(i+1))){
				double sum = numberList.get(i) + numberList.get(i + 1);
				numberList.set(i, sum);
				numberList.remove(i+1);
				i = -1;
			}
		}
		
		DecimalFormat decimalFormat = new DecimalFormat("0.#");
		for (Double number : numberList) {
			System.out.print(decimalFormat.format(number) + " ");
		}
		
		
		
	}
}
