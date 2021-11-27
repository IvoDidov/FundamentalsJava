import java.util.Scanner;
import java.text.DecimalFormat;

public class MathPower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double num = Double.parseDouble(scanner.nextLine());
		double power = Double.parseDouble(scanner.nextLine());

		double result = calcPower(num, power);
		System.out.println(new DecimalFormat("0.####").format(result));
	}

	private static double calcPower(double num, double pow) {
		double result = 1;
		for (int i =1; i<= pow; i++) {
			result = result * num;
		}
		return result;
	}

}

