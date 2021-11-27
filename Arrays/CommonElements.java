import java.util.Scanner;

public class CommonElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] input1 = (scanner.nextLine()).split(" ");
		String[] input2 = (scanner.nextLine()).split(" ");

		for (String word1 : input2) {
			for (String word2 : input1) {
				if (word1.equals(word2)) {
					System.out.print(word2 + " " );
					break;
				}
			}
		}
	}
}

