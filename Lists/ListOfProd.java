import java.util.*;
import java.text.DecimalFormat;

public class ListOfProd {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		List<String> prod = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			prod.add(scanner.nextLine());
		}
		
		Collections.sort(prod);
		for (int i =0; i < prod.size(); i++) {
		System.out.println((i+1) + "." + prod.get(i));
		}
	}
}
