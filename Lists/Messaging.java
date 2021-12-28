import java.util.stream.Collectors;
import java.util.*;

public class Messaging {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> bigNum = Arrays.stream(scanner.nextLine().split(" "))
				.collect(Collectors.toList());

		String text = scanner.nextLine();
		StringBuilder resultBuild = new StringBuilder();
		StringBuilder textBuild = new StringBuilder();
		textBuild.append(text);

		for (int i = 0; i < bigNum.size(); i++) {
			int sum = 0;
			for (int j = 0; j < (bigNum.get(i)).length(); j++) {
				sum += bigNum.get(i).charAt(j) -48;
			}
			sum = sum % (textBuild.length() );
			resultBuild.append(textBuild.charAt(sum));
			textBuild.deleteCharAt(sum);

		}

		String result = resultBuild.toString();
		System.out.println(result);

	}
}
