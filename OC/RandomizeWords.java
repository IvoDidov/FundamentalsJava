import java.util.*;

public class RandimizeWords {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input = scanner.nextLine().split(" ");

		Random random = new Random();
		for (int i = 0; i < input.length; i++) {
			int randomIndex = random.nextInt(input.length);
			String temp = input[i];
			input[i] = input[randomIndex];
			input[randomIndex] = temp;
		}
		
		for (String word : input) {
			System.out.println(word);
		}

	}
}


