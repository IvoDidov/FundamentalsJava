import java.util.List;
import java.util.Scanner;

public class AppendArrays_list_exc_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String[] arrays = input.split("\\|");
		for (int i = arrays.length - 1; i >= 0 ; i--) {
			String elements = arrays[i].trim();
			if ( elements.equals(" ") || elements.equals("")) {
				continue;
			}
			String[] numbers = elements.split("\\s+");
			for (String number:numbers) {
				System.out.print(number + " ");
			}
		}

	}
}
