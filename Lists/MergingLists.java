import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class MergingLists {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> list1 = Arrays.stream(scanner.nextLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
			
		List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());
			
		List<Integer> listResult = new ArrayList<>();
		
		
		int listSize;
		if (list1.size() > list2.size()) {
			listSize = list1.size();
		} else {
			listSize = list2.size();
		}
			
		for (int i = 0; i < listSize; i++) {
			if (i < list1.size()) {
				listResult.add(list1.get(i));
			}
			if (i < list2.size()) {
				listResult.add(list2.get(i));
			}
		}
		
		for (Integer num : listResult) {
			System.out.print(num + " ");
		}
			
			 
		
	}
}
