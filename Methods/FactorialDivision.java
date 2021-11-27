import java.util.Scanner;

public class FactorialDivision {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = Integer.parseInt(scanner.nextLine());
		int b = Integer.parseInt(scanner.nextLine());
		
		double result = fact(a)/fact(b);
		System.out.printf("%.2f",result);
	}

	private static double fact(int a) {
		if (a == 0) {
			return 1;
		} else {
			double result = 1;
			for (int i = 1; i <= a; i++) {
				result *= i;
			}
			return result;
		}
	}

}
		
