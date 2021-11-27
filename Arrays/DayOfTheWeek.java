import java.util.Arrays;
import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] daysOfTheWeek = {"Monday","Tuesday","Wednesday","Thursdat","Friday","Saturday","Sunday"};

		int day = Integer.parseInt(scanner.nextLine());

		if ( day >= 1 && day <= 7) {
			System.out.println(daysOfTheWeek[day-1]);
		} else {
			System.out.println("Invalid day!");
		}

	}
}



