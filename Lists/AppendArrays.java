import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		List<String> list = Arrays.stream(input.split("\\|"))
		.collect(Collectors.toList());
		Collections.reverse(list);
		System.out.println(list.toString()
			.replace("[", "")
			.replace("]", "")
			.replaceAll(",", "")
			.trim()
			.replaceAll("\\s+", " "));
		
		//for (int i = 0; i <= arrays.length -1; i++) {
			//String currentArray = arrays[arrays.length -1 - i].trim();
			//if ( currentArray.equals(" ") || currentArray.equals("")) {
				//continue;
			//}
			//String[] nums = currentArray.split("\\s+");
			//for (String num : nums) {
				//System.out.print(num + " ");
			//}
		//}
		
		
	}
}
