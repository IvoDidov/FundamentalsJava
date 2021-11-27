import java.util.*;
import java.text.DecimalFormat;
import java.util.stream.Collectors;



public class RemovesNegativesAndReverse {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
			
		nums = removeNegatives(nums);
		
		if (nums.isEmpty()) {
			System.out.print("empty");
		} else {
			for (int i = 0; i < nums.size(); i++) {
				System.out.print(nums.get(nums.size()-1 -i) + " ");
			}
		}
		
		
	}
	
	private static List<Integer> removeNegatives(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			int element = list.get(i);
			if (element < 0) {
				list.remove(Integer.valueOf(element));
				i--;
			}
		}
		return list;
	}
			
	
}
