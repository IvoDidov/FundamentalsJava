import java.util.*;
import java.math.*;

public class SumBigNumbers {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String num1 = scanner.nextLine();
		String num2 = scanner.nextLine();
		
		BigInteger bigNum1 = new BigInteger(num1);
		BigInteger bigNum2 = new BigInteger(num2);
		BigInteger result = bigNum1.add(bigNum2);
		
		System.out.println(result);
		
	}
}
		
		
