import java.util.Scanner;

public class PokeMon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int originalPower = Integer.parseInt(scanner.nextLine()); // orig N
		double power = originalPower; // N 
		int distance = Integer.parseInt(scanner.nextLine()); // M
		int exhaustion = Integer.parseInt(scanner.nextLine()); // Y
		int pokes = 0;
		while ( power >= distance) { // N >= M
			power -= distance;
			pokes ++;
			if ( power == originalPower * 0.5) {
				if ( exhaustion > 0) {
					power = power / exhaustion;
				}
			}
		}
		System.out.println((int)power);
		System.out.println(pokes);
	}
}




